package com.javachobo.enums;

public class Enum_test {

  public static void main(String[] args) {

    // Week today;
    // today = Week.MONDAY;
    //
    // System.out.println(today);
    //
    // // name
    // System.out.println(today.name());
    //
    // // ordinal 순서로 표기 0 ~ **
    // System.out.println(today.ordinal());
    // System.out.println(Week.FRIDAY.ordinal());
    //
    // // compareTo 순서의 차이
    // System.out.println(Week.MONDAY.compareTo(Week.SUNDAY));
    //
    // // valueOf
    // Week day = Week.valueOf("MONDAY");
    // System.out.println(day);
    //
    // // values
    // Week[] days = Week.values();
    // for (Week day1 : days) {
    // System.out.println(day1);
    // }

    Week[] days = Week.values();
    for (Week day : days) {
      System.out.println(day + ": " + day.getKor());
    }

    // System.out.println(Week.SATURDAY.kor);
    // Week.SATURDAY.kor = "요일"; // 값이 바뀌므로 private 하게 설정 해야한다.
    // System.out.println(Week.SATURDAY.kor);

    System.out.println(Week.SATURDAY.getKor()); // private 하기 때문에 getter를 이용해야 한다.

  }

}
