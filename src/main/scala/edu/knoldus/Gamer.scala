package edu.knoldus

import org.apache.log4j.Logger

class Gamer {
  val log = Logger.getLogger(this.getClass)
  val random = new scala.util.Random

  def gamer(): String = {
    val number = 1 + random.nextInt((6 - 1) + 1)
    if (isWinner(number, 0)) {
      s"\nGamer is Winner!"
    }
    else {
      s"\nGamer is Loser"
    }

  }

  def isWinner(num: Int, count: Int): Boolean = {
    log.info(s"\nNumber = $num")
    num match {
      case 1 | 6 if count < 3 => {
        val num = 1 + random.nextInt((6 - 1) + 1)
        isWinner(num, count + 1)
      }
      case _ if count == 3 => true
      case _ if count < 3 => false
    }
  }

}
