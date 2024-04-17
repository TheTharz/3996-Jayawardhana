pipeline {
  agent any
  triggers{
    githubPush()
  }
  stages {
    stage('build'){
      steps {
        sh 'docker build -t jenkins-node-image .'
      }
    }
    stage('run'){
      steps{
        sh 'docker run -d -p 5000:3000 jenkins-node-image'
      }
    }
    stage('final'){
      steps{
        sh 'docker ps'
      }
    }
    stage('push'){
      steps{
        script{
          withCredentials([string(credentialsId: 'docker-pwd', variable: 'docker-pwd')]) {
            sh 'docker login -u thetharz -p ${docker-pwd}'
          }
            sh 'docker push thetharz/3996-node-app-image'
        }
      }
    }
  }

}
