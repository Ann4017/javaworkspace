package com.javachobo.generics;

public class Fruit_box2_test {

  public static void main(String[] args) {
    Fruit_box<Fruit> fruit_box = new Fruit_box<>();
    Fruit_box<Apple> apple_box = new Fruit_box<>();
    Fruit_box<Grape> grape_box = new Fruit_box<>();
    // Fruit_box<Toy> toy_box = new Fruit_box<>(); error

    fruit_box.add(new Fruit());
    fruit_box.add(new Apple());
    fruit_box.add(new Grape());

    apple_box.add(new Apple());
    // apple_box.add(new Grape()); error

    System.out.println(fruit_box.to_string());
    System.out.println(apple_box.to_string());
    System.out.println(grape_box.to_string());

  }

}
