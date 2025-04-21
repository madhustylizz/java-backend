pipeline {
    agent any

    environment {
        REGISTRY = 'your-docker-repo/java-backend'
        IMAGE_NAME = 'java-backend'
        TAG = "${env.BUILD_ID}"
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/madhustylizz/java-backend.git'
            }
        }

        stage('Build') {
            steps {
                script {
                    sh 'mvn clean package -DskipTests'
                }
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    sh "docker build -t ${REGISTRY}:${TAG} ."
                }
            }
        }

        stage('Push Docker Image') {
            steps {
                script {
                    sh "docker push ${REGISTRY}:${TAG}"
                }
            }
        }

        stage('Deploy') {
            steps {
                script {
                    sh "docker run -d -p 8080:8080 ${REGISTRY}:${TAG}"
                }
            }
        }
    }

    post {
        always {
            cleanWs()
        }
    }
}
