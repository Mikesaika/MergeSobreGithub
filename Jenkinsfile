pipeline {
    agent any

    environment {
        APP_NAME   = 'fishgold'
        DEPLOY_DIR = "${WORKSPACE}\\deploy_env"
        JAR_FILE   = 'target\\fishgold-1.0-SNAPSHOT.jar'
    }

    stages {
        stage('Build') {
            steps {
                echo '=== Compilando el proyecto FishGold ==='
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                echo '=== Ejecutando pruebas unitarias ==='
                bat 'mvn test'
            }
            post {
                always {
                    junit allowEmptyResults: false, testResults: 'target/surefire-reports/*.xml'
                }
            }
        }

        stage('Deploy') {
            steps {
                echo '=== Empaquetando y desplegando en entorno de prueba local ==='
                bat 'mvn package -DskipTests'
                bat """
                    if not exist "${DEPLOY_DIR}" mkdir "${DEPLOY_DIR}"
                    copy /Y "${JAR_FILE}" "${DEPLOY_DIR}\\fishgold.jar"
                    dir "${DEPLOY_DIR}"
                """
            }
        }
    }

    post {
        success {
            archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            echo "Pipeline exitoso: ${env.JOB_NAME} #${env.BUILD_NUMBER}"
            // Descomentar al configurar SMTP o Slack en Jenkins:
            // emailext(
            //     subject: "EXITO: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
            //     body: "El pipeline de FishGold finalizo correctamente.\nBuild: ${env.BUILD_URL}",
            //     to: 'equipo@ejemplo.com'
            // )
        }
        failure {
            echo "Pipeline fallido: ${env.JOB_NAME} #${env.BUILD_NUMBER}"
            // Descomentar al configurar SMTP o Slack en Jenkins:
            // emailext(
            //     subject: "FALLO: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
            //     body: "El pipeline de FishGold fallo. Revisar consola:\n${env.BUILD_URL}",
            //     to: 'equipo@ejemplo.com'
            // )
        }
    }
}
