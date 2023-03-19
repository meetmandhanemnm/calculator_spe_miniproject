pipeline {

    environment {
        registry = "meetmandhane/calculator"
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
                   dockerImage = docker.build('meetmandhane/calculator')
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
        stage('Docker image cleanup') {
            steps{
                sh "docker rmi $registry"
            }
        }
        stage('Ansible image run') {
            steps{
                ansiblePlaybook becomeUser: null, colorized: true, disableHostKeyChecking: true, inventory: 'deployment/inventory', playbook: 'deployment/deploy.yml', sudoUser: null
            }
        }
    }
}
