package com.javachobo.generics2;

import java.util.Collections;

public class Fruit_box4_test {

  public static void main(String[] args) {

    Fruit_box<Apple> apple_box = new Fruit_box<>();
    Fruit_box<Grape> grape_box = new Fruit_box<>();

    apple_box.add(new Apple("green apple", 300));
    apple_box.add(new Apple("green apple", 200));
    apple_box.add(new Apple("green apple", 100));

    grape_box.add(new Grape("green grape", 300));
    grape_box.add(new Grape("green grape", 400));
    grape_box.add(new Grape("green grape", 200));

    Collections.sort(apple_box.get_list(), new Apple_comp()); // 정렬 할 list, 정렬의 기준
    System.out.println(apple_box);
    Collections.sort(grape_box.get_list(), new Grape_comp());
    System.out.println(grape_box);
    Collections.sort(apple_box.get_list(), new Furit_comp());
    System.out.println(apple_box);
    Collections.sort(grape_box.get_list(), new Furit_comp());
    System.out.println(grape_box);

  }

}
