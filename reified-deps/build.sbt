val ReifiedScala3 = "3.10.0-RC1-bin-SNAPSHOT-nonbootstrapped"
val ReifiedLibrary = "3.10.0-RC1-bin-SNAPSHOT"
val ReifiedCatsKernelVersion = "2.9.0-reified-SNAPSHOT"
val ReifiedAlgebraVersion = "2.9.0-reified-SNAPSHOT"

ThisBuild / organization := "org.typelevel"
ThisBuild / scalaVersion := ReifiedScala3
ThisBuild / crossScalaVersions := Seq(ReifiedScala3)
ThisBuild / autoScalaLibrary := false
ThisBuild / scalacOptions ++= Seq("-source:3.2", "-nowarn")
ThisBuild / libraryDependencies ++= Seq(
  "org.scala-lang" % "scala3-library_3" % ReifiedLibrary,
  "org.scala-lang" % "scala-library" % ReifiedLibrary
)
ThisBuild / Compile / packageDoc / publishArtifact := false

lazy val reifiedDependencySettings = Seq(
  allDependencies ~= { dependencies =>
    dependencies.filterNot(_.configurations.exists(_.startsWith("scala-doc-tool")))
  }
)

lazy val root = project
  .in(file("."))
  .aggregate(catsKernel, algebra)
  .settings(
    name := "reified-typelevel-dependencies",
    publish / skip := true
  )

lazy val catsKernel = project
  .in(file("cats-kernel"))
  .settings(reifiedDependencySettings)
  .settings(
    name := "cats-kernel",
    moduleName := "cats-kernel",
    version := ReifiedCatsKernelVersion
  )

lazy val algebra = project
  .in(file("algebra"))
  .settings(reifiedDependencySettings)
  .settings(
    name := "algebra",
    moduleName := "algebra",
    version := ReifiedAlgebraVersion
  )
  .dependsOn(catsKernel)
