package com.javachobo.generics;

import java.util.ArrayList;

public class Array_list_test {

  public static void main(String[] args) {

    // ���׸���
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(new Integer(1));
    list.add(new Integer(2));
    list.add(new Integer(3));
    // list.add(new String("a")); // ���׸��� Integer�� ��� �����Ƿ� �ٸ� Ÿ���� ����� �� ����.

    int num = list.get(0);
    System.out.println(num);

    for (int i : list) { // object Ÿ������ �޴°� �ƴ϶� ĳ������ �ʿ䰡 ����.
      System.out.println(i);
    }



  }

}
