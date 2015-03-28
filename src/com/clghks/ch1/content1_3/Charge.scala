package com.clghks.ch1.content1_3

import com.clghks.ch1.content1_1.CreditCard

/**
 * Created by ChiHwan on 15. 3. 29..
 */
case class Charge(cc: CreditCard, amount: Double) {
  def combine(other: Charge) : Charge = {
    if(cc == other.cc){
      Charge(cc, amount + other.amount)
    }else{
      throw new Exception("Can't combine charges to different cards")
    }
  }
}
