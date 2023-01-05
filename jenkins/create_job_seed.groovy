job('jenkins-test-dsl-project') {
    scm {
        git('https://github.com/samperay/demo-fastapi.git') {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('samperay')
            node / gitConfigEmail('sunlnx@gmail.com')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    // wrappers {
    //     nodejs('nodejs') // this is the name of the NodeJS installation in 
    //                      // Manage Jenkins -> Configure Tools -> NodeJS Installations -> Name
    // }
    steps {
        shell("test creation of jenkins sample dsl project")
    }
}