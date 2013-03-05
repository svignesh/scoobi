name := "ScoobiWordCount"

version := "1.0"

scalaVersion := "2.9.2"

scalacOptions ++= Seq("-Ydependent-method-types", "-deprecation")

libraryDependencies ++= Seq("com.nicta" %% "scoobi" % "0.6.2-cdh4")

resolvers ++= Seq("nicta's avro" at "http://nicta.github.com/scoobi/releases",
                  "sonatype snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
                  "cloudera" at "https://repository.cloudera.com/content/repositories/releases")
