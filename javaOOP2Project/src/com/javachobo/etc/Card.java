package com.javachobo.etc;

public class Card {


  String kind;
  int num;

  public Card() {
    super();
  }

  public Card(String kind, int num) {
    super();
    this.kind = kind;
    this.num = num;
  }

  @Override
  public String toString() { // 참조값을 문자열로 확인하고 싶을 때 toString 을 오버라이딩 하여 활용한다.
    return "Card [kind=" + kind + ", num=" + num + "]";
  }


}
