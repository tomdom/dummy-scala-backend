lazy val root = (project in file("."))
  .settings(
    name := "dummy-scala-backend",
    organization := "com.github.tomdom",
    version := "0.1-SNAPSHOT",
    scalaVersion := "2.12.4",
    crossScalaVersions := Seq("2.10.7", "2.11.12", "2.12.4"),
    publishTo := {
      val tomdomMvn = Path.userHome.absolutePath + "/projects/github/tomdom/tomdom-mvn"
      if (isSnapshot.value)
        Some(Resolver.file("file", new File(tomdomMvn + "/snapshots")))
      else
        Some(Resolver.file("file", new File(tomdomMvn + "/releases")))
    }
  )
