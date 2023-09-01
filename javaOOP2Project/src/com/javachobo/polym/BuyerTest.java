package com.javachobo.polym;

public class BuyerTest {

  public static void main(String[] args) {
    Tv t = new Tv();
    Computer c = new Computer();
    Audio a = new Audio();

    Buyer buyer = new Buyer();

    buyer.buy(t);
    System.out.println(buyer.money);
    System.out.println(buyer.bonus_point);
    System.out.println();

    buyer.buy(c);
    System.out.println(buyer.money);
    System.out.println(buyer.bonus_point);
    System.out.println();

    buyer.buy(a);
    System.out.println(buyer.money);
    System.out.println(buyer.bonus_point);
    System.out.println();



  }

}
