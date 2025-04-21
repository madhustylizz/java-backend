pipeline {
    agent any
    stages {
        stage('Clone') {
            steps {
                git 'https://github.com/madhustylizz/java-backend.git'
            }
        }
        stage('Build Docker Image') {
            steps {
                script {
                    dockerImage = docker.build("java-backend")
                }
            }
        }
        stage('Run Container') {
            steps {
                sh 'docker run -d -p 8082:8082 --name backend java-backend'
            }
        }
    }
}
