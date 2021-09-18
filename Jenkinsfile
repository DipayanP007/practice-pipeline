pipeline{
    agent any

    tools{
        maven "Maven"
        
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