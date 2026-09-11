def buildApp() {
    sh 'mvn clean compile'
}

def runTests() {
    sh 'mvn test'
}

def packageApp() {
    sh 'mvn package'
}

def deployApp(String appName) {
    sh "echo Deploying ${appName}"
    sh "cp target/*.jar /opt/apps/${appName}/"
}
