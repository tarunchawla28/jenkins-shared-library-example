#!/usr/bin/env groovy
def call(String MVN_HOME){
        withEnv(["mvnHome=${MVN_HOME}"]){
        sh '${mvnHome}/bin/mvn clean package'
        }
}
