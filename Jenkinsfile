pipeline {
    agent any
    tools { // <1>
        maven 'maven 3.3.9' // <2>
        jdk 'jdk8' // <3>
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