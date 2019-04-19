package com.shlib;
def build() {
  sh "mvn package"
}
def deploy() {
  sh "mvn deploy"
}
