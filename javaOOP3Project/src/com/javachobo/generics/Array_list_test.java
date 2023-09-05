package com.javachobo.generics;

import java.util.ArrayList;

public class Array_list_test {

  public static void main(String[] args) {

    // 제네릭스
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(new Integer(1));
    list.add(new Integer(2));
    list.add(new Integer(3));
    // list.add(new String("a")); // 제네릭을 Integer로 명시 했으므로 다른 타입은 사용할 수 없다.

    int num = list.get(0);
    System.out.println(num);

    for (int i : list) { // object 타입으로 받는게 아니라 캐스팅이 필요가 없다.
      System.out.println(i);
    }



  }

}
