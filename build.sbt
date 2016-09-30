lazy val root = (project in file("."))
  .settings(reformatOnCompileSettings: _*)
  .settings(
    name := "dummy-scala-backend",
    organization := "com.github.tomdom",
    version := "0.1-SNAPSHOT",
    scalaVersion := "2.11.8",
    crossScalaVersions := Seq("2.10.6", "2.11.8"),
    publishTo := {
      val tomdomMvn = Path.userHome.absolutePath + "/projects/github/tomdom/tomdom-mvn"
      if (isSnapshot.value)
        Some(Resolver.file("file", new File(tomdomMvn + "/snapshots")))
      else
        Some(Resolver.file("file", new File(tomdomMvn + "/releases")))
    },
    reformatOnCompileSettings
  )
