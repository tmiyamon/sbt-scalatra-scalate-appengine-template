import sbt._
class Plugins(info: ProjectInfo) extends PluginDefinition(info) {
  val ideaPluginRepo = "GH-pages repo" at "http://mpeltonen.github.com/maven/"
  lazy val idea = "com.github.mpeltonen" % "sbt-idea-plugin" % "0.1-SNAPSHOT"
  lazy val appEngine = "net.stbbs.yasushi" % "sbt-appengine-plugin" % "2.1" from "http://cloud.github.com/downloads/Yasushi/sbt-appengine-plugin/sbt-appengine-plugin-2.1.jar"
  //lazy val scalate = "net.stbbs.yasushi" % "sbt-scalate-plugin" % "1.1" 
  lazy val sbtScalatePlugin = "org.fusesource.scalate" % "sbt-scalate-plugin" % "1.4.1"
}
