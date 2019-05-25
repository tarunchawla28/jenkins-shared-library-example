#!/usr/bin/env groovy
def call(String imageName){
  sh 'pwd'
  sh 'sudo docker build -t ${imageName} .'
}
