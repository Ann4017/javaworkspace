package com.javachobo.generics2;

import java.util.Comparator;

public class Furit_comp implements Comparator<Fruit> {

  @Override
  public int compare(Fruit o1, Fruit o2) {

    return o1.weight - o2.weight;
  }

}
