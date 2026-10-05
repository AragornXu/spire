lazy val reifiedVersions = settingKey[java.util.Properties]("Shared reified compiler and dependency versions")

ThisBuild / reifiedVersions := {
  val properties = new java.util.Properties
  val input = new java.io.FileInputStream((ThisBuild / baseDirectory).value / "versions.properties")
  try properties.load(input)
  finally input.close()
  properties
}

ThisBuild / organization := "org.typelevel"
ThisBuild / scalaVersion := reifiedVersions.value.getProperty("scalaVersion")
ThisBuild / crossScalaVersions := Seq(scalaVersion.value)
ThisBuild / autoScalaLibrary := false
ThisBuild / scalacOptions ++= Seq("-source:3.2", "-nowarn")
ThisBuild / libraryDependencies ++= Seq(
  // "org.scala-lang" % "scala3-library_3" % reifiedVersions.value.getProperty("libraryVersion"),
  "org.scala-lang" % "scala-library" % reifiedVersions.value.getProperty("libraryVersion")
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
  .settings(reifiedDependencySettings)
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
    version := reifiedVersions.value.getProperty("catsKernelVersion")
  )

lazy val algebra = project
  .in(file("algebra"))
  .settings(reifiedDependencySettings)
  .settings(
    name := "algebra",
    moduleName := "algebra",
    version := reifiedVersions.value.getProperty("algebraVersion")
  )
  .dependsOn(catsKernel)
