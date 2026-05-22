pipeline {
    agent any

    stages {

        stage('Clone Code') {
            steps {
                git branch: 'main',
                url: 'https://github.com/ImOrTaL1206/cicdproject.git'
            }
        }

        stage('Build') {
            steps {
                sh 'chmod +x mvnw'
                sh './mvnw clean package'
            }
        }

        stage('Docker Build') {
            steps {
                sh 'docker build -t cicdproject .'
            }
        }

        stage('Push to ECR') {
            steps {
                sh '''
                aws ecr get-login-password --region ap-south-1 | docker login --username AWS --password-stdin 244862165007.dkr.ecr.ap-south-1.amazonaws.com

                docker tag cicdproject:latest 244862165007.dkr.ecr.ap-south-1.amazonaws.com/cicdproject:latest

                docker push 244862165007.dkr.ecr.ap-south-1.amazonaws.com/cicdproject:latest
                '''
            }
        }
    }
}