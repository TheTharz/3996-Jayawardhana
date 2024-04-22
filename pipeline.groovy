pipeline {
  agent any
  triggers{
    githubPush()
  }
  stages {
    stage('build'){
      steps {
        sh 'docker build -t thetharz/3996-node-app-image .'
      }
    }
    stage('run'){
      steps{
        sh 'docker run -d -p 5000:3000 thetharz/3996-node-app-image'
      }
    }
    stage('final'){
      steps{
        sh 'docker ps'
      }
    }
  }
}
