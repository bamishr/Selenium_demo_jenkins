pipeline {
    agent any
    tools { // <1>
       // maven 'maven 3.2.5' // <2>
        //jdk 'jdk1.8.0_151' // <3>
    }
    stages {
        stage ('Initialize') {
            steps {
                println("Initialize")
				sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                '''
            }
        }

        stage ('Build') {
            steps {
               println("Build")
            }
        }

        stage ('test') {
                    steps {
                       bat "mvn test"
                    }
        }

    }
}