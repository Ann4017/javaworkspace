package com.javachobo.polym;

public class Product {

  int price;
  int bonus_point;

  Product(int price) { // �����ڴ� ����� ����� �ƴϹǷ� �ڽ� Ŭ�������� super�� ����ؾ� �Ѵ�.
    this.price = price;
    this.bonus_point = (int) (price / 10.0);
  }
}
