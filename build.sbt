organization := "com.github.wangzaixiang"

name := "scala-sql"

version := "1.1.0"

scalaVersion := "2.12.10"

crossScalaVersions := Seq("2.11.8", "2.12.10")

libraryDependencies ++= Seq(
  "org.slf4j" % "slf4j-api" % "1.7.9",
  "com.h2database" % "h2" % "1.4.184" % "test",
  "junit" % "junit" % "4.12" % "test",
  "ch.qos.logback" % "logback-classic" % "1.1.3" % "test",
  "mysql" % "mysql-connector-java" % "5.1.38" % "test"
)
publishMavenStyle := true


resolvers ++= List("isuwang nexus" at "http://nexus.oa.isuwang.com/repository/maven-public",
  "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots",
  "Objectify Play Repository" at "http://schaloner.github.io/releases/",
  "Objectify Play Snapshot Repository" at "http://schaloner.github.io/snapshots/"
)

publishTo := Some("nexus-releases" at "http://nexus.oa.isuwang.com/repository/maven-releases/")

credentials += Credentials("Sonatype Nexus Repository Manager", "nexus.oa.isuwang.com", "admin", "6d17f21ed")

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

