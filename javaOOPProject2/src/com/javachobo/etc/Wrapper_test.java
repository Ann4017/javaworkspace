package com.javachobo.etc;

import java.util.Random;

public class Wrapper_test {

  public static void main(String[] args) {

    // 래퍼클래스 (기본형 8개)
    // 기본형과 참조형 간 의 형변환을 하기 위해서
    // 오토박싱 (박싱, 언박싱)

    // boolean -> Boolean
    // int -> Integer
    // byte -> Byte

    int i = 10;
    Integer it = new Integer(i); // 참조형으로 박싱

    int i2 = 20;
    Integer it2 = i2; // Integer it2 = (Integer)i2; // 캐스팅 연산자는 생략이 가능하

    int i3;
    Integer it3 = new Integer(30);
    i3 = (int) it3; // 참조형을 기본형으로 언박싱

    System.out.println(i + it3);


    Object obj = i; // 오토박싱 -> Integer(i)

    // i = obj; // err

    String.valueOf(100); // 숫자를 문자열로
    Integer.parseInt("100"); // 문자열을 숫자로


    // Random 클래스
    Random ran = new Random();
    ran.nextInt(10); // 0 ~ 9 사이의 난수
    ran.nextDouble(); // 0.0 <= x < 1.0
    ran.nextBoolean();

  }

}
