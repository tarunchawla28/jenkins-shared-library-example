#!/usr/bin/env groovy
def call(){
withEnv(["MVN_HOME=$mvnHome"]){
    sh '$MVN_HOME/bin/mvn clean package'
   }
}
