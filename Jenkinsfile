pipeline {

    environment {
        registry = "meetmandhane/calculator_miniproject"
        registryCredential = 'dockerhub'
        dockerImage = ''
    }
    agent any

    stages {
        stage('Git clone') {
            steps {
               git 'https://github.com/meetmandhanemnm/calculator_spe_miniproject.git'
            }
        }
        stage('Maven Build'){
            steps{
                sh "mvn clean install"
            }
        }
        stage('Build Docker File'){
            steps{
                script{
                   dockerImage = docker.build('calculator')
                }
            }
        }
        stage('Push Docker image to Dockerhub') {
            steps{
                script{
                   docker.withRegistry( '', registryCredential ) {
                        dockerImage.push()
                   }
                }
            }
        }
    }
}
