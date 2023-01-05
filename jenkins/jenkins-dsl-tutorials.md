- [Jenkins DSL](#jenkins-dsl)
  - [Demo project](#demo-project)
  - [Plugins installed](#plugins-installed)
  - [Build step](#build-step)
- [References](#references)


# Jenkins DSL

We will explain here about the Jenkins using groovy script for pipeline.

## Demo project

We will be using an fastapi demo which will be run using an docker container

Github URL: https://github.com/samperay/demo-fastapi.git

## Plugins installed

- CloudBees Docker Build and Publish plugin 
- Job DSL

## Build step

For testing purpose, create a new job -> build steps -> Docker Build and Publish

Docker Hub Repository Name: sunlnx/demo-fastapi
Docker Hub Registry Credentials: Dashboard -> Manage Jenkins -> Manager Credentials -> System -> Global Credentials -> Add Credentials -> Select 'Username with password' and update your dockerhub credentials, which is later referenced using id. (dockerhub)

You will be able from the jenkins console that you might have built image and pushed to docker hub repository.

# References 

Jenkins dsl plugins documentation - https://jenkinsci.github.io/job-dsl-plugin/#

