pipeline{
    agent any
    stages{
        //stage pour gitclone le projet java
        stage('Git Clone'){
            steps{
                git branch: 'main', url: 'https://github.com/Eldorado-hub/demo.git'
            }
        }
        //stage pour compiler le projet java avec maven
        stage('Maven Compile'){
            steps{
                sh 'mvn clean compile'
            }
        }
        //stage pour tester le projet java avec maven
        stage('Maven Test'){
            steps{
                sh 'mvn test'
            }
        }
        //stage pour package le projet java avec maven
        stage('Maven Package'){
            steps{
                sh 'mvn package'
            }
        }
        //stage pour lancer l'application java avec maven
        stage('Maven Run'){
            steps{
                sh 'java -jar target/demo-0.1.jar'
            }
        }
        //stage pour dire que le pipeline est fini
        stage('Finish'){
            steps{
                echo 'Pipeline terminé'
            }
        }
    }
}