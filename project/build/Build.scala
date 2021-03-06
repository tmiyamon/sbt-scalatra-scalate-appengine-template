import sbt._

class MyProject(info: ProjectInfo) extends AppengineProject(info) with org.fusesource.scalate.sbt.PrecompilerWebProject  with IdeaProject {
  lazy val scalatraVersion = "2.0.0.M3"
  lazy val scalatra = "org.scalatra" %% "scalatra" % scalatraVersion
  lazy val scalate = "org.scalatra" %% "scalatra-scalate" % scalatraVersion
  lazy val logback = "ch.qos.logback" % "logback-classic" % "0.9.26"

  // Alternatively, you could use scalatra-specs
  val scalatest = "org.scalatra" %% "scalatra-scalatest" % scalatraVersion % "test"

  // Pick your favorite slf4j binding
  val slf4jBinding = "ch.qos.logback" % "logback-classic" % "0.9.25" % "runtime"

  // http://groups.google.com/group/simple-build-tool/msg/1f17b43807d06cda
  override def testClasspath = super.testClasspath +++ buildCompilerJar

  val sonatypeNexusSnapshots = "Sonatype Nexus Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
  // For Scalate
  val fuseSourceSnapshots = "FuseSource Snapshot Repository" at "http://repo.fusesource.com/nexus/content/repositories/snapshots"

  override def precompileTemplatesAction = super.precompileTemplatesAction dependsOn(prepareWebappAction) 
  override def devAppserverStartAction = task{ args => devAppserverStartTask(args) dependsOn(precompileTemplates) }
  override def updateWebappAction = task{ opts => appcfgTask("update", None, opts) dependsOn(precompileTemplates) } describedAs("Create or update an app version with precompiled templates.") 
}
