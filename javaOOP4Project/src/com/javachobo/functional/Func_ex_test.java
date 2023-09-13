package com.javachobo.functional;

import java.util.ArrayList;

public class Func_ex_test {

  public static void main(String[] args) {

    ArrayList<Double> list = new ArrayList<>();

    for (int i = 0; i < 10; i++) {
      list.add((double) i);
    }

    Func_ex.<Double>print_arr(list);

  }

}
