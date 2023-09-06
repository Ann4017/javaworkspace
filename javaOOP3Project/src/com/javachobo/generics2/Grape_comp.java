package com.javachobo.generics2;

import java.util.Comparator;

public class Grape_comp implements Comparator<Grape> {

  @Override
  public int compare(Grape o1, Grape o2) {

    return o2.weight - o1.weight; // 내림차순 정렬
  }

}
