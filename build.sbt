lazy val commonSettings = Seq(
  organization := "com.scriptfuzz",
  version := "1.0",
  scalaVersion := "2.11.8"
)
lazy val root = (project in file("."))
   .settings(commonSettings)
  .settings(
    name := "lloyd",
    libraryDependencies  ++= Seq(
    "org.twitter4j" % "twitter4j-core" % "4.0.4",
    "org.twitter4j" % "twitter4j-stream" % "4.0.4"
    )
  )
