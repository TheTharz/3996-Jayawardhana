pipeline {
  agent any
  stages {
    stage("test"){
      steps {
        sh 'node --version'
      }
    }
    stages('build'){
      steps {
        sh 'docker build -t jenkins-node-image .'
      }
    }
    stages('run'){
      steps{
        sh 'docker run -d -p 5000:3000 jenkins-node-image'
      }
    }
    stages('final'){
      steps{
        sh 'docker ps'
      }
    }
  }

}