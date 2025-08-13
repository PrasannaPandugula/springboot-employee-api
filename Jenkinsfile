pipeline {
    agent any

    tools {
        maven 'Maven3'   
        jdk 'Java21'     
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', url: 'https://github.com/PrasannaPandugula/springboot-employee-api.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage('Run Application') {
            steps {
                bat 'start /B java -jar target\\*.jar'
            }
        }
    }
}
