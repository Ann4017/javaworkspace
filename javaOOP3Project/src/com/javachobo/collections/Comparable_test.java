package com.javachobo.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Comparable_test {

  public static void main(String[] args) {

    ArrayList list = new ArrayList<>();

    Student s1 = new Student("ann1", 1, 1, 70, 70, 70);
    Student s2 = new Student("wann2", 1, 2, 70, 70, 70);
    Student s3 = new Student("hann3", 1, 3, 70, 70, 70);
    Student s4 = new Student("vann4", 1, 4, 70, 70, 70);
    Student s5 = new Student("dann5", 1, 5, 70, 70, 70);

    list.add(s1);
    list.add(s2);
    list.add(s3);
    list.add(s4);
    list.add(s5);

    System.out.println(list);
    Collections.sort(list);
    System.out.println(list);



  }

}
