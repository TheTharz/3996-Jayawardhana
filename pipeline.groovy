pipeline {
  agent any
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
  }

}