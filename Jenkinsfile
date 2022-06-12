pipeline{
  agent any
  stages{
    
    stage("build"){
      
      steps{
        echo 'bild stage'
      }
    }
    
     stage("test"){
      
      steps{
          echo 'test stage'
      }
    }
  }
  post{
    
    always{
      
      echo 'done all stages'
    }
  }
}
