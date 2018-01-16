package edu.knoldus

import org.apache.log4j.Logger

object Scenario extends App {
  val log = Logger.getLogger(this.getClass)

  log.info(s"\n Output for Question 1 \n")
  val payment = new TiffinService
  val amount = 300
  log.info(s"\nIf you paytm, then amount payable is Rs.${payment.amountPayable("Paytm", amount)}")
  log.info(s"\nIf you Freecharge, then amount payable is Rs.${payment.amountPayable("freecharge", amount)}")
  log.info(s"\nIf you do Net banking, then amount payable is Rs.${payment.amountPayable("Net Banking", amount)}")
  log.info(s"\nIf you Card Payment, then amount payable is Rs.${payment.amountPayable("Card Payment", amount)}")
  log.info(s"\nIf you cash, then amount payable is Rs.${payment.amountPayable("cash", amount)}")

  log.info(s"\n\n Output for Question 2 \n")
  val game = new Gamer
  log.info(s"${game.gamer()}\n")

  val trainer = new Trainer
  log.info(s"${trainer.strength()}\n")

  val blogList = Map("Scala" -> 2, "Java" -> 5, "Kafka" -> 6)
  val favourite = new Blogger
  log.info(s"${favourite.favouriteTechnology(blogList, 5)}\n")

}
