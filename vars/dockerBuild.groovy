#!/usr/bin/env groovy
def call(String imageName,String userNameDocker){
  sh 'pwd'
  echo "${imageName}"
  sh "sudo docker build -t ${imageName} ."
}


