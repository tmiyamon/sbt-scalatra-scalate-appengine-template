# Scalatra-Scalate template project for appengine
This template project is based on https://github.com/scalatra/scalatra-sbt-prototype

1. Clone this repository:

        git clone git://github.com/tmiyamon/sbt-scalatra-scalate-appengine-template.git my-app

2. Set env. For more detail, refer to [Yasushi's sbt-appengine-plugin](https://github.com/Yasushi/sbt-appengine-plugin).

        export APPENGINE_SDK_HOME=/your/appengine/sdk/home/path

3. Change directory into your clone:

        cd my-app

4. Launch [SBT](http://code.google.com/p/simple-build-tool).

        sbt

5. At SBT prompt, fetch the dependencies.  Do this the first time and also whenever you change the project definition.

        update

6. Run dev-appengine server

        dev-appserver-start

7. Go to http://localhost:8080/

8. Deploy to your appengine

        update-webapp

