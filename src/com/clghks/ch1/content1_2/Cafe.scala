package com.clghks.ch1.content1_2

import com.clghks.ch1.content1_1.{Coffee, CreditCard}

/**
 * Created by ChiHwan on 15. 3. 28..
 */
class Cafe {
  def buyCoffee(cc: CreditCard, p: Payments): Coffee = {
    val cup = new Coffee()
    p.charge(cc, cup.price)
    cup
  }
}
