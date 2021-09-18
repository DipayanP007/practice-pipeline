pipeline{
    agent any

    stages{
        stage("Build"){
            steps{
                echo "========executing A========"
            }
            post{
                always{
                    echo "========always========"
                }
                
            }
        }
    }
    
}