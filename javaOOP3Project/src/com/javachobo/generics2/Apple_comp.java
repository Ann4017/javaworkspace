package com.javachobo.generics2;

import java.util.Comparator;

public class Apple_comp implements Comparator<Apple> {

  @Override
  public int compare(Apple o1, Apple o2) {

    return o1.weight - o2.weight; // 오름차순 정렬
  }

}
