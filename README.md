My Demo Project
===============

[![Java CI with Maven](https://github.com/eirikbraend/spring-demo/actions/workflows/maven.yml/badge.svg)](https://github.com/eirikbraend/spring-demo/actions/workflows/maven.yml)

TODO
----
* Which maven version is used?
* split into: system test and system integration test?
* Docker image. How? build pack or Dockerfile? gh-action?
* Use azure sql database. 
  * Setup database with "schema/db" and users
* do extra "stuff" for main branch? or splitt jobs/workflows?
* create reusable workflows or actions?
  * database setup?
* Use sealed secrets?
* hosted runners for prod deploy
* Build docker image and upload to azure container registry
* Use docker with maven and jdk as build image?
* publish junit reports?

* for baxdes: Do we need to publish the war file? if workflow also deploys, we can use "in process"
What about des-test (for system test) and des-core (tdes)?

Notes:
* Deploy to azure k8s, or orange only?
How does maven caching work when using docker image?

Don't use azure devops feed as mirror for all dependencies. Only for own artifacts.

Maven *does* filter `${env.FOO}` in `settings.xml`.

Flux/gitops for k8s deployment.

-- next:
Maven settings:
* no more mirror of central
* keep repos in settings.xml or pom.xml?
* need to have to servers in settings.xml:
  * one for distribution management server id - with GITHUB_TOKEN
  * one for each github package repo? - with PAT token

Use test repo in techcloud for testing packages and learn
pub