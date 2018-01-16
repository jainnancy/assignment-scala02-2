package edu.knoldus

//import org.apache.log4j.Logger

class TiffinService {

  def amountPayable(paymentMethod: String, amount: Int): Double = {

    paymentMethod match {
      case paymentMethod if paymentMethod.equalsIgnoreCase("paytm") | paymentMethod.equalsIgnoreCase("freecharge") => amount + amount * 0.02
      case paymentMethod if paymentMethod.equalsIgnoreCase("Net Banking") => amount + 2
      case paymentMethod if paymentMethod.equalsIgnoreCase("Card Payment") => amount + 1.5
      case paymentMethod if paymentMethod.equalsIgnoreCase("Cash") => amount
    }
  }

}
