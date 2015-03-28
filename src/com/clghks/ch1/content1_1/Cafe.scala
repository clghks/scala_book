package com.clghks.ch1.content1_1

/**
 * Created by ChiHwan on 15. 3. 28..
 */
class Cafe {
  def buyCoffee(cc: CreditCard): Coffee = {
    val cup = new Coffee()
    cc.charge(cup.price)
    cup
  }
}
