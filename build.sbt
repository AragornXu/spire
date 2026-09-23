val header = """|**********************************************************************\
                |* Project                                                              **
                |*       ______  ______   __    ______    ____                          **
                |*      / ____/ / __  /  / /   / __  /   / __/     (c) 2011-2021        **
                |*     / /__   / /_/ /  / /   / /_/ /   / /_                            **
                |*    /___  / / ____/  / /   / __  /   / __/   Erik Osheim, Tom Switzer **
                |*   ____/ / / /      / /   / / | |   / /__                             **
                |*  /_____/ /_/      /_/   /_/  |_|  /____/     All rights reserved.    **
                |*                                                                      **
                |*      Redistribution and use permitted under the MIT license.         **
                |*                                                                      **
                |\***********************************************************************
                |""".stripMargin

import scala.language.existentials

lazy val scalaCheckVersion = "1.17.0"

lazy val munit = "1.0.0-M7"
lazy val munitDiscipline = "2.0.0-M3"

lazy val algebraVersion = "2.9.0"
lazy val reifiedCatsKernelVersion = "2.9.0-reified-SNAPSHOT"
lazy val reifiedAlgebraVersion = "2.9.0-reified-SNAPSHOT"

lazy val apfloatVersion = "1.10.1"
lazy val jscienceVersion = "4.3.1"
lazy val apacheCommonsMath3Version = "3.6.1"

val Scala213 = "2.13.16"
val Scala3 = "3.2.2"
val ReifiedScala3 = "3.10.0-RC1-bin-SNAPSHOT-nonbootstrapped"
val ReifiedLibrary = "3.10.0-RC1-bin-SNAPSHOT"

lazy val reifiedJvmSettings = Seq(
  autoScalaLibrary := scalaVersion.value != ReifiedScala3,
  libraryDependencies ++= {
    if (scalaVersion.value == ReifiedScala3)
      Seq(
        scalaOrganization.value % "scala3-library_3" % ReifiedLibrary,
        scalaOrganization.value % "scala-library" % ReifiedLibrary
      )
    else Seq.empty
  },
  dependencyOverrides ++= {
    if (scalaVersion.value == ReifiedScala3)
      Seq(
        "org.typelevel" %% "cats-kernel" % reifiedCatsKernelVersion,
        "org.typelevel" %% "algebra" % reifiedAlgebraVersion
      )
    else Seq.empty
  },
  Compile / run / fork := scalaVersion.value == ReifiedScala3,
  Test / fork := scalaVersion.value == ReifiedScala3
)

lazy val stockMacroCompilerSettings = Seq(
  scalaVersion := {
    val targetScalaVersion = (ThisBuild / scalaVersion).value
    if (targetScalaVersion == ReifiedScala3) Scala3 else targetScalaVersion
  }
)

Global / onChangedBuildSource := ReloadOnSourceChanges

ThisBuild / tlBaseVersion := "0.18"
ThisBuild / tlJdkRelease := {
  val sv = scalaVersion.value
  if (sv.endsWith("-nonbootstrapped")) None
  else Some(8)
}

// ThisBuild / scalaVersion := Scala213
// ThisBuild / crossScalaVersions := Seq(Scala213, Scala3)
ThisBuild / scalaVersion := ReifiedScala3
ThisBuild / crossScalaVersions := Seq(Scala213, Scala3, ReifiedScala3)
ThisBuild / githubWorkflowJavaVersions := Seq("8", "11", "17").map(JavaSpec.temurin(_))

ThisBuild / homepage := Some(url("https://typelevel.org/spire/"))
ThisBuild / licenses := Seq("MIT" -> url("https://opensource.org/licenses/MIT"))
ThisBuild / developers := List(
  Developer(
    "id_m",
    "Erik Osheim",
    "",
    url("https://github.com/non/")
  ),
  Developer(
    "tixxit",
    "Tom Switzer",
    "",
    url("https://github.com/tixxit/")
  )
)

ThisBuild / tlFatalWarnings := false

// Projects

lazy val root = tlCrossRootProject
  .aggregate(macros, core, extras, examples, laws, platform, tests, util, benchmark)
  .settings(spireSettings)
  .settings(unidocSettings)
  .enablePlugins(ScalaUnidocPlugin)

lazy val platform = crossProject(JSPlatform, JVMPlatform, NativePlatform)
  .settings(moduleName := "spire-platform")
  .settings(spireSettings: _*)
  .jvmSettings((commonJvmSettings ++ reifiedJvmSettings): _*)
  .jsSettings(commonJsSettings: _*)
  .dependsOn(macros, util)

lazy val macros = crossProject(JSPlatform, JVMPlatform, NativePlatform)
  .crossType(CrossType.Pure)
  .settings(moduleName := "spire-macros")
  .settings(spireSettings: _*)
  .settings(scalaCheckSettings: _*)
  .settings(munitSettings: _*)
  .jvmSettings(commonJvmSettings: _*)
  .jvmSettings(stockMacroCompilerSettings: _*)
  .jsSettings(commonJsSettings: _*)

lazy val util = crossProject(JSPlatform, JVMPlatform, NativePlatform)
  .crossType(CrossType.Pure)
  .settings(moduleName := "spire-util")
  .settings(spireSettings: _*)
  .jvmSettings((commonJvmSettings ++ reifiedJvmSettings): _*)
  .jsSettings(commonJsSettings: _*)
  .dependsOn(macros)

lazy val core = crossProject(JSPlatform, JVMPlatform, NativePlatform)
  .crossType(CrossType.Pure)
  .settings(moduleName := "spire")
  .settings(spireSettings: _*)
  .settings(coreSettings: _*)
  .jvmSettings((commonJvmSettings ++ reifiedJvmSettings): _*)
  .jsSettings(commonJsSettings: _*)
  .dependsOn(macros, platform, util)

lazy val extras = crossProject(JSPlatform, JVMPlatform, NativePlatform)
  .crossType(CrossType.Pure)
  .settings(moduleName := "spire-extras")
  .settings(spireSettings: _*)
  .settings(extrasSettings: _*)
  .jvmSettings((commonJvmSettings ++ reifiedJvmSettings): _*)
  .jsSettings(commonJsSettings: _*)
  .dependsOn(macros, platform, util, core)

lazy val docs = project
  .in(file("site"))
  .enablePlugins(TypelevelSitePlugin, ScalaUnidocPlugin)
  .settings(laikaConfig ~= { _.withRawContent })
  .dependsOn(macros.jvm, core.jvm, extras.jvm)
  .settings(commonSettings: _*)
  .settings(spireSettings: _*)
  .settings(commonJvmSettings: _*)
  .settings(reifiedJvmSettings: _*)

lazy val examples = project
  .settings(moduleName := "spire-examples")
  .settings(spireSettings)
  .settings(
    libraryDependencies ++= Seq(
      "org.apfloat" % "apfloat" % apfloatVersion,
      "org.jscience" % "jscience" % jscienceVersion
    )
  )
  .enablePlugins(NoPublishPlugin)
  .settings(commonJvmSettings)
  .settings(reifiedJvmSettings)
  .dependsOn(core.jvm, extras.jvm)

lazy val laws = crossProject(JSPlatform, JVMPlatform, NativePlatform)
  .crossType(CrossType.Pure)
  .settings(moduleName := "spire-laws")
  .settings(spireSettings: _*)
  .settings(
    libraryDependencies ++= Seq(
      "org.typelevel" %%% "algebra-laws" % algebraVersion,
      "org.scalacheck" %%% "scalacheck" % scalaCheckVersion
    )
  )
  .jvmSettings((commonJvmSettings ++ reifiedJvmSettings): _*)
  .jsSettings(commonJsSettings: _*)
  .dependsOn(core, extras)

lazy val tests = crossProject(JSPlatform, JVMPlatform, NativePlatform)
  .crossType(CrossType.Full)
  .settings(moduleName := "spire-tests")
  .settings(spireSettings: _*)
  .settings(munitSettings: _*)
  .enablePlugins(NoPublishPlugin)
  .jvmSettings((commonJvmSettings ++ reifiedJvmSettings): _*)
  .jsSettings(commonJsSettings: _*)
  .dependsOn(core, extras, laws)

lazy val benchmark: Project = project
  .in(file("benchmark"))
  .settings(moduleName := "spire-benchmark")
  .settings(spireSettings)
  .enablePlugins(NoPublishPlugin)
  .settings(commonJvmSettings)
  .settings(
    libraryDependencies ++= Seq(
      "org.apfloat" % "apfloat" % apfloatVersion,
      "org.jscience" % "jscience" % jscienceVersion,
      "org.apache.commons" % "commons-math3" % apacheCommonsMath3Version
    )
  )
  .enablePlugins(JmhPlugin)
  .settings(reifiedJvmSettings)
  .dependsOn(core.jvm, extras.jvm)

lazy val reifiedBenchmark: Project = project
  .in(file("benchmark/reified"))
  .settings(moduleName := "spire-reified-benchmark")
  .settings(spireSettings)
  .enablePlugins(NoPublishPlugin)
  .settings(commonJvmSettings)
  .settings(reifiedJvmSettings)
  .settings(
    scalaVersion := ReifiedScala3,
    crossScalaVersions := Seq(ReifiedScala3),
  )
  .dependsOn(core.jvm)

lazy val buildSettings = Seq(
  allDependencies ~= { deps =>
    deps.filterNot(_.configurations.exists(_.startsWith("scala-doc-tool")))
  },
  scalacOptions := {
    val scalacOps = scalacOptions.value
    val opts = scalacOps.filterNot(_.startsWith("-source:")) :+ "-nowarn"
    if (tlIsScala3.value && scalaVersion.value.endsWith("-nonbootstrapped"))
      opts :+ "-source:3.2"
      // opts :+ "-source:3.2" :+ "-language:experimental.inlineTraits"
    else if (tlIsScala3.value)
      opts
    else
      scalacOps
  }
)

lazy val commonDeps = Seq(
  libraryDependencies ++= Seq(
    "org.typelevel" %%% "algebra" % {
      if (scalaVersion.value == ReifiedScala3) reifiedAlgebraVersion else algebraVersion
    }
  )
)

lazy val commonSettings = Seq(
  headerLicense := Some(HeaderLicense.Custom(header))
) ++ scalaMacroDependencies

lazy val commonJsSettings = Seq()

lazy val commonJvmSettings = Seq()

ThisBuild / tlSiteApiUrl := Some(url("https://www.javadoc.io/doc/org.typelevel/spire_2.13/latest/spire/index.html"))

lazy val coreSettings = Seq(
  Compile / sourceGenerators += (Compile / genProductTypes).taskValue,
  genProductTypes := {
    val scalaSource = (Compile / sourceManaged).value
    val s = streams.value
    s.log.info("Generating spire/std/tuples.scala")
    val algebraSource = ProductTypes.algebraProductTypes
    val algebraFile = (scalaSource / "spire" / "std" / "tuples.scala").asFile
    IO.write(algebraFile, algebraSource)

    Seq[File](algebraFile)
  }
)

lazy val extrasSettings = Seq()

lazy val genProductTypes = TaskKey[Seq[File]]("gen-product-types", "Generates several type classes for Tuple2-22.")

lazy val scalaCheckSettings = Seq(libraryDependencies += "org.scalacheck" %%% "scalacheck" % scalaCheckVersion % Test)

lazy val munitSettings = Seq(
  libraryDependencies ++= Seq(
    "org.scalameta" %%% "munit" % munit % Test,
    "org.typelevel" %%% "discipline-munit" % munitDiscipline % Test
  )
)

lazy val spireSettings = buildSettings ++ commonSettings ++ commonDeps

lazy val unidocSettings = Seq(
  ScalaUnidoc / unidoc / unidocProjectFilter := inAnyProject -- inProjects(examples, benchmark, tests.jvm)
)

lazy val scalaMacroDependencies: Seq[Setting[_]] = Seq(
  libraryDependencies ++= {
    if (scalaVersion.value.startsWith("3")) Seq.empty
    else Seq(scalaOrganization.value % "scala-reflect" % scalaVersion.value % "provided")
  }
)
