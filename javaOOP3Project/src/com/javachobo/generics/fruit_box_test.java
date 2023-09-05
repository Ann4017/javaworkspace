package com.javachobo.generics;

public class fruit_box_test {

  public static void main(String[] args) {

    Box<Fruit> fruit_box = new Box<>();
    Box<Apple> apple_box = new Box<>();
    Box<Grape> grape_box = new Box<>();
    Box<Toy> toy_box = new Box<>();

    fruit_box.add(new Apple());
    fruit_box.add(new Grape());

    toy_box.add(new Toy());

    // fruit_box.add(new Toy); // 타입 제한
    // toy_box.add(new Apple);

    System.out.println(fruit_box.to_string());
    System.out.println(toy_box.to_string());

  }

}
