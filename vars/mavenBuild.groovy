#!/usr/bin/env groovy
def call(String mvnHome){
withEnv(["MVN_HOME=$mvnHome"]){
    $MVN_HOME/bin/mvn clean package
   }
}
