My Demo Project
===============

[![Java CI with Maven](https://github.com/eirikbraend/spring-demo/actions/workflows/maven.yml/badge.svg)](https://github.com/eirikbraend/spring-demo/actions/workflows/maven.yml)

TODO
----
* Which maven version is used?
* Upload artifact. To where?
* split into: system test and system integration test?
* Docker image. How? build pack or Dockerfile?
* Use azure sql database. 
  * Setup database with "schema/db" and users
* do extra "stuff" for main branch?
* create reusable workflows or actions?
  * database setup?
* Use sealed secrets?
* hosted runners for prod deploy

* Use docker with maven and jdk as build image?

Notes:

build with docker image works.
What if combined with setup-java?
or manual config of: cache and settings?

How does maven caching work when using docker image?

Don't use azure devops feed as mirror for all dependencies. Only for own artifacts.

Maven *does* filter `${env.FOO}` in `settings.xml`.