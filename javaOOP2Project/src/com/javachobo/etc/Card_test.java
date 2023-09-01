package com.javachobo.etc;

public class Card_test {

  public static void main(String[] args) {

    Card c1 = new Card("hart", 10);
    Card c2 = new Card("spade", 2);

    System.out.println(c1.toString()); // toString() 은 생략 된다.
    System.out.println(c2);


  }

}
