#!/usr/bin/env groovy
def call(String MVN_HOME){
        ${MVN_HOME}/bin/mvn clean package
}
