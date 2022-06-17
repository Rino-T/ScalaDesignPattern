lazy val designPattern2 = (project in file("scala2"))
  .settings(
    name := "DesignPattern Scala2",
    version := "0.1",
    scalaVersion := "2.13.8",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.12" % Test
    )
  )

lazy val designPattern3 = (project in file("scala3"))
  .settings(
    name := "DesignPattern Scala3",
    version := "0.1",
    scalaVersion := "3.1.2",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.12" % Test
    )
  )
