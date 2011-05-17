# Scalatra-Scalate template project for appengine
This template project is based on https://github.com/scalatra/scalatra-sbt-prototype.

1. Clone this repository:

        git clone git://github.com/tmiyamon/sbt-scalatra-scalate-appengine-template.git my-app

2. Change directory into your clone:

        cd my-app

3. Launch [SBT](http://code.google.com/p/simple-build-tool).

        ./sbt

4. At SBT prompt, fetch the dependencies.  Do this the first time and also whenever you change the project definition.

        update

5. Run dev-appengine server

        dev-appserver-start

6. Precompile scalate template

        precompile-template

7. Go to http://localhost:8080/.

