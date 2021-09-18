pipeline{
    agent any

    tools{
        maven "Maven 3.8.2"
        
    }
    stages{
        stage("Build"){
            steps{
                echo "========executing Build========"
                sh '''
                mvn clean compile
                '''
            }
            
        }
        stage("Test"){
            steps{
                sh 'mvn test'
            }
            
        }
        stage("Package")
        {
            steps{
                sh 'mvn package'
            }
        }
    }
    post{
        success{
            sh 'echo Success'
        }
    }
    
}