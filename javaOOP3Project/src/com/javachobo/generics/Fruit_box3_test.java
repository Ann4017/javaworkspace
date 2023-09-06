package com.javachobo.generics;

public class Fruit_box3_test {

  public static void main(String[] args) {

    Fruit_box<Fruit> fruit_box = new Fruit_box<>();
    Fruit_box<Apple> apple_box = new Fruit_box<>();

    fruit_box.add(new Apple());
    fruit_box.add(new Grape());
    apple_box.add(new Apple());
    apple_box.add(new Apple());

    Juice juice = Juicer.make_juicer(fruit_box);
    System.out.println(juice);
    juice = Juicer.make_juicer(apple_box);
    System.out.println(juice);



  }

}
