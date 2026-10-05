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

lazy val apfloatVersion = "1.10.1"
lazy val jscienceVersion = "4.3.1"
lazy val apacheCommonsMath3Version = "3.6.1"

val Scala213 = "2.13.16"
val Scala3 = "3.2.2"
lazy val reifiedVersions = settingKey[java.util.Properties]("Shared reified compiler and dependency versions")
lazy val reifiedScalaVersion = settingKey[String]("Locally published reified compiler version")
lazy val reifiedLibraryVersion = settingKey[String]("Locally published reified standard-library version")
lazy val reifiedCatsKernelVersion = settingKey[String]("Reified Cats Kernel version")
lazy val reifiedAlgebraVersion = settingKey[String]("Reified Algebra version")
lazy val publishReifiedDependencies = taskKey[Unit]("Compile and publish the reified dependencies locally")
lazy val cleanReifiedDependencies = taskKey[Unit]("Clean the reified dependency build")
lazy val prepareReifiedDependencies = taskKey[Unit]("Publish dependencies when using the reified compiler")

lazy val reifiedDependencyRoot = RootProject(uri("reified-deps/"))
lazy val reifiedCatsKernel = ProjectRef(uri("reified-deps/"), "catsKernel")
lazy val reifiedAlgebra = ProjectRef(uri("reified-deps/"), "algebra")

ThisBuild / reifiedVersions := {
  val properties = new java.util.Properties
  val input = new java.io.FileInputStream((ThisBuild / baseDirectory).value / "reified-deps" / "versions.properties")
  try properties.load(input)
  finally input.close()
  properties
}
ThisBuild / reifiedScalaVersion := reifiedVersions.value.getProperty("scalaVersion")
ThisBuild / reifiedLibraryVersion := reifiedVersions.value.getProperty("libraryVersion")
ThisBuild / reifiedCatsKernelVersion := reifiedVersions.value.getProperty("catsKernelVersion")
ThisBuild / reifiedAlgebraVersion := reifiedVersions.value.getProperty("algebraVersion")

ThisBuild / publishReifiedDependencies := {
  (reifiedCatsKernel / publishLocal).value
  (reifiedAlgebra / publishLocal).value
}
ThisBuild / cleanReifiedDependencies := {
  (reifiedCatsKernel / clean).value
  (reifiedAlgebra / clean).value
  (reifiedDependencyRoot / clean).value
}

lazy val reifiedJvmSettings = Seq(
  prepareReifiedDependencies := Def.taskDyn {
    if (scalaVersion.value == reifiedScalaVersion.value)
      Def.task { (ThisBuild / publishReifiedDependencies).value }
    else Def.task { () }
  }.value,
  // Publishing must finish before update resolves the local SNAPSHOT jars.
  update := update.dependsOn(prepareReifiedDependencies).value,
  clean := clean.dependsOn(ThisBuild / cleanReifiedDependencies).value,
  autoScalaLibrary := scalaVersion.value != reifiedScalaVersion.value,
  libraryDependencies ++= {
    if (scalaVersion.value == reifiedScalaVersion.value)
      Seq(
        // scalaOrganization.value % "scala3-library_3" % reifiedLibraryVersion.value,
        scalaOrganization.value % "scala-library" % reifiedLibraryVersion.value
      )
    else Seq.empty
  },
  dependencyOverrides ++= {
    if (scalaVersion.value == reifiedScalaVersion.value)
      Seq(
        "org.typelevel" %% "cats-kernel" % reifiedCatsKernelVersion.value,
        "org.typelevel" %% "algebra" % reifiedAlgebraVersion.value
      )
    else Seq.empty
  },
  Compile / run / fork := scalaVersion.value == reifiedScalaVersion.value,
  Test / fork := scalaVersion.value == reifiedScalaVersion.value
)

lazy val stockMacroCompilerSettings = Seq(
  scalaVersion := {
    val targetScalaVersion = (ThisBuild / scalaVersion).value
    if (targetScalaVersion == reifiedScalaVersion.value) Scala3 else targetScalaVersion
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
ThisBuild / scalaVersion := reifiedScalaVersion.value
ThisBuild / crossScalaVersions := Seq(Scala213, Scala3, reifiedScalaVersion.value)
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
  .configureRoot(_.aggregate(reifiedDependencyRoot).settings(reifiedJvmSettings))
  .configureJVM(_.aggregate(reifiedDependencyRoot).settings(reifiedJvmSettings))
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
    scalaVersion := reifiedScalaVersion.value,
    crossScalaVersions := Seq(reifiedScalaVersion.value),
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
      if (scalaVersion.value == reifiedScalaVersion.value) reifiedAlgebraVersion.value else algebraVersion
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
