job('demo-fastapi') {
    scm {
        git('https://github.com/samperay/demo-fastapi.git') {
            displayName("demo-fastapi")
            description("Project for demo jenkins-dsl and fastapi")
        }
    }
    steps {
        dockerBuildAndPublish {
            repositoryName('sunlnx/demo-fastapi')
            tag('${GIT_REVISION,length=9}')
            registryCredentials('dockerhub')
            forcePull(false)
            forceTag(false)
            createFingerprints(false)
            skipDecorate()
        }
    }
}