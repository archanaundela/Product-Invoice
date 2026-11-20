pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                echo 'Source Code checkout completed'
            }
        }
        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
        stage('package')
        {
            steps{
                bat 'mvn package'
            }
        }
    }
}
