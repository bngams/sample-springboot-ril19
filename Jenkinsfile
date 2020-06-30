pipeline {
    agent any
    tools {
        jdk 'JDK11' 
    }
    environment {
        SCANNER_HOME = tool 'SonarScanner4'
    }
    stages {
        stage ('Build') {
            steps {
                sh '''
                    chmod a+x mvnw
                    ./mvnw clean package
                ''' 
            }
        }
        stage('SonarQube analysis') {
            steps {
                sh '''
                    $SCANNER_HOME/bin/sonar-scanner \
                      -Dsonar.projectKey=sample-springboot \
                      -Dsonar.host.url=http://192.168.99.100:9000 \
                      -Dsonar.login=c511381679f49dbd2c78b0c6560af91c08df18b6 \
                      -Dsonar.java.binaries=target
                '''
            }
            
        }
    }
}
