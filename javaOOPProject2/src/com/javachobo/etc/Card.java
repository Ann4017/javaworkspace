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
  public String toString() { // �������� ���ڿ��� Ȯ���ϰ� ���� �� toString �� �������̵� �Ͽ� Ȱ���Ѵ�.
    return "Card [kind=" + kind + ", num=" + num + "]";
  }


}
