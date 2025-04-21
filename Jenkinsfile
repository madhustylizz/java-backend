pipeline {
    agent any

    environment {
        REGISTRY = 'your-docker-repo/backend-app'
        IMAGE_NAME = 'backend-app'
        TAG = "${env.BUILD_ID}"
    }

    stages {
        stage('Checkout Repositories') {
            steps {
                // Checkout both frontend and backend repositories
                git url: 'https://github.com/madhustylizz/java-backend.git', branch: 'main'
                dir('angular-frontend') {
                    git url: 'https://github.com/madhustylizz/angular-frontend.git', branch: 'main'
                }
            }
        }

        stage('Build Backend and Frontend') {
            steps {
                script {
                    // Build the backend with Maven
                    sh 'mvn clean package -DskipTests'

                    // Build the Angular app
                    dir('angular-frontend') {
                        sh 'npm install'
                        sh 'npm run build --prod'
                    }
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
                    sh "docker run -d -p 8082:8082 ${REGISTRY}:${TAG}"
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
