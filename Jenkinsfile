pipeline {
  agent any
  stages {
    stage('prueba_build') {
      steps {
        //clone repo
        git(url: 'https://github.com/YesidRico/testProfileSpringBoot.git', branch: 'master')

        //build 
        bat: "${tool 'Gradle 4.6'}/bin/gradle build"
      }
    }
  }
}