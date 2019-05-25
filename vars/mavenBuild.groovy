#!/usr/bin/env groovy
def call(String MVN_HOME){
        withEnv($MVN_HOME){
        sh '${MVN_HOME}/bin/mvn clean package'
        }
}
