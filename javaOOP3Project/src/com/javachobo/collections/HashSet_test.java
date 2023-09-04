package com.javachobo.collections;

import java.util.HashSet;

public class HashSet_test {

  public static void main(String[] args) {

    HashSet set = new HashSet<>();

    Person p1 = new Person("ann", 10);
    Person p2 = new Person("ann", 10);
    Person p3 = new Person("ann", 30);

    set.add(p1);
    set.add(p2);
    set.add(p3);

    System.out.println(set);

  }

}
