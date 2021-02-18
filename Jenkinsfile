node {
    def mvnfile = "maven-demo/pom.xml"
   
    stage ("checkout") {
      checkout scm
      sh "mvn -f ${mvnfile} clean install" 
    }
}
