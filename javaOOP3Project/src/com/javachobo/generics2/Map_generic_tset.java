package com.javachobo.generics2;

import java.util.HashMap;
import java.util.Map;

public class Map_generic_tset {

  public static void main(String[] args) { // Map 제네릭 사용

    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    map.put(1, 1);
    map.put(2, 2);
    map.put(3, 3);

    // Iterator<Map.Entry<Integer, Integer>> entrys = map.entrySet().iterator();

    // while (entrys.hasNext()) {
    // Map.Entry entry = entrys.next();
    // System.out.println(entry.getKey());
    // System.out.println(entry.getValue());
    // }

    // for (Map.Entry<Integer, Integer> entrys : map.entrySet()) {
    // System.out.println(entrys.getKey());
    // System.out.println(entrys.getValue());
    // }

    map.forEach((k, v) -> { // forEach 를 활용해 Map, list 를 순회하는 방법
      System.out.println(k + ", " + v);
    });
  }

}
