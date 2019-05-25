#!/usr/bin/env groovy
def call(String imageName){
  sh 'pwd'
  echo "${imageName}"
  sh "sudo docker build -t ${imageName}"
}


