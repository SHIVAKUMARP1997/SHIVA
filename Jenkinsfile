pipeline {
    agent { label 'agent-slave' }

    environment {
        GIT_REPO = 'https://github.com/PixelShiv/DevOps.git'   // change if needed
        BRANCH   = 'master'
    }

    stages {
        stage('Checkout') {
            steps {
                echo "Cloning repository from ${GIT_REPO}"
                git branch: "${BRANCH}", url: "${GIT_REPO}"
            }
        }

        stage('Build with Maven') {
            steps {
                echo 'Building project and packaging JAR with Maven...'
                sh 'mvn clean install'
            }
        }

        stage('Archive Artifact') {
            steps {
                echo 'Archiving generated JAR file...'
                archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
            }
        }
    }

    post {
        success {
            echo 'Build completed successfully!'
        }
        failure {
            echo 'Build failed. Please check logs.'
        }
    }
}
