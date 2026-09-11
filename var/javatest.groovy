def call(Map config){
    pipeline{
        tools{
            maven "${config.mvnt}"
        }
        agent any
        stages{
            stage('Checkout'){
                steps{
                    git branch : config.branch,
                    credentialsId : config.credid,
                    url : config.repourl
                }
            }
            stage('Build'){
                steps{
                    sh "mvn ${config.mvncommand}"
                }
            }
        }
    }
}
