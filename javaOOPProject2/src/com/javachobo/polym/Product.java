package com.javachobo.polym;

public class Product {

  int price;
  int bonus_point;

  Product(int price) { // 생성자는 상속의 대상이 아니므로 자식 클래스에서 super를 사용해야 한다.
    this.price = price;
    this.bonus_point = (int) (price / 10.0);
  }
}
