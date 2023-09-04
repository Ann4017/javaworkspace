package com.javachobo.collections;

import java.util.TreeSet;

public class TreeSet_test {

  public static void main(String[] args) {

    TreeSet set = new TreeSet<>(); // 자동 정렬

    // TreeSet
    // 값으로 사용하는 객체에 반드시 정렬과 관련 된 인터페이스가 오버 라이딩 되어있어야 한다.
    // 데이터를 정렬 해준다.(오름차순)
    // 데이터 타입(참조형) 안에 정렬에 대한 정의가 되어있다.
    // Integer에 값의 정렬을 구현하고 있다.

    set.add(1); // == Integer(1) 오토박싱
    set.add(2);
    set.add(5);
    set.add(3);
    set.add(4);

    System.out.println(set);

    for (Object obj : set) {
      int i = (Integer) obj;
      System.out.println(i);
    }

  }

}
