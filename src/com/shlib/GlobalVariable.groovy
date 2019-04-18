package com.shlib

class GlobalVariable
 {
   static String gbvar = "MyVar"
  
   def info(message) {
    echo "INFO: ${message}"
   }

  def warning(message) {
    echo "WARNING: ${message}"
  }
 
}

