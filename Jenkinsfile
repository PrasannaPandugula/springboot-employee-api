pipeline {
    agent any

    tools {
        maven 'Maven3'   
        jdk 'Java21'     
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', url: 'https://github.com/your-username/springboot-employee-api.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage('Run Application') {
            steps {
                bat 'start /B java -jar target/springboot-employee-api-1.0.0.jar'
            }
        }
    }
}
