resolvers += Classpaths.sbtPluginReleases

addSbtPlugin("org.scoverage"     %  "sbt-scoverage"        % "1.5.0")

addSbtPlugin("io.spray"          %  "sbt-revolver"         % "0.8.0")
addSbtPlugin("com.typesafe.sbt"  %  "sbt-native-packager"  % "1.1.5")
addSbtPlugin("com.timushev.sbt"  %  "sbt-updates"          % "0.3.0")
addSbtPlugin("net.virtual-void"  %  "sbt-dependency-graph" % "0.8.2")