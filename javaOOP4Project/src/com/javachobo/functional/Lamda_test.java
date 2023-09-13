package com.javachobo.functional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Lamda_test {

  public static void main(String[] args) {

    ArrayList<Integer> list = new ArrayList<>();

    for (int i = 0; i < 10; i++) {
      list.add(i);
    }

    // consumer 의 accept(); 활용
    list.forEach(i -> System.out.print(i)); // list를 순회 하는 메소드 forEach (매개변수로는 람다식이 들어가면 된다.)
    System.out.println();
    list.removeIf(x -> x % 2 == 0 && x % 3 == 0);
    list.forEach(i -> System.out.print(i));

    list.replaceAll(i -> i * 10); // UnaryOperator<Integer> 매개변수 와 리턴타입이 동일하게 구성 되어야한다.
    System.out.println(list);


    Map<String, String> map = new HashMap<>();
    map.put("1", "10");
    map.put("2", "20");
    map.put("3", "30");
    map.put("4", "40");

    map.forEach((k, v) -> System.out.println(k + " " + v));


  }

}
