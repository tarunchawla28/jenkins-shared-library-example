#!/usr/bin/env groovy
def call(String imageNamem,String userNameDockerHub){
  sh 'pwd'
  echo "${imageName}"
  sh "sudo docker build -t ${imageName} ."
}


