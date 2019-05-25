#!/usr/bin/env groovy
def call(){
withEnv(["MVN_HOME=$mvnHome"]){
    $MVN_HOME/bin/mvn clean package
   }
}
