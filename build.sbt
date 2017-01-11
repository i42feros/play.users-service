name := """users-service"""

version := "0.1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  ws,
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test
)
