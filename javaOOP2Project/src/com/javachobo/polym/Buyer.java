package com.javachobo.polym;

public class Buyer {

  int money = 1000;
  int bonus_point = 0;


  void buy(Product p) {

    if (money <= p.price) {
      System.out.println("ÀÜ¾× ºÎÁ·");
      return;
    }

    money -= p.price;
    bonus_point += p.bonus_point;
  }
}
