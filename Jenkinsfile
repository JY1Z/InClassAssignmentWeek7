pipeline {
    agent any
    tools {
        maven 'Maven3'
        jdk 'Java_Home'
    }
    stages {
        stage('checking') {
            steps {
                git branch: 'main', url: 'https://github.com/JY1Z/InClassAssignmentWeek7.git'
            }
        }

        stage('build') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage('Test & Coverage') {
            steps{
                bat 'mvn test jacoco:report'
            }
            post {
                always{
                    junit 'target/surefire-reports/*.xml'
                    jacoco execPattern: '**/target/jacoco.exec',
                           classPattern: '**/target/classes',
                        sourcePattern: '**/src/main/java',
                        exclusionPattern: '**/test/**'
                }
            }
        }
    }
}

