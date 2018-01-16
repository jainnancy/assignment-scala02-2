package edu.knoldus

import org.apache.log4j.Logger

class Trainer {
  val log = Logger.getLogger(this.getClass)
  val random = new scala.util.Random

  def strength(): String = {
    val present = 1 + random.nextInt((50 - 1) + 1)
    s"\nPresent class Strength is $present"
  }

}




