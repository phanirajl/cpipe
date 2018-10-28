import sbt._

object Dependencies {
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.0.5"
  lazy val playJson = "com.typesafe.play" %% "play-json" % "2.6.9"
  lazy val cassandra = "com.datastax.cassandra" % "cassandra-driver-core" % "3.6.0"
  lazy val scallop = "org.rogach" %% "scallop" % "3.1.3"
  lazy val logback = "ch.qos.logback" % "logback-classic" % "1.2.3"
  lazy val lz4 = "net.jpountz.lz4" % "lz4" % "1.3.0"
}
