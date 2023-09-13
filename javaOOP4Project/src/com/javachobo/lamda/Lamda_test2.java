package com.javachobo.lamda;

public class Lamda_test2 {

  public static void main(String[] args) {

    // 함수형 인터페이스의 형변환
    // Object 로 직접 형변환 불가
    // (Object) (() -> {}) x
    // 함수형 인터페이스로 형변환 후 Object 타입으로 변환가능

    My_func f = () -> {
    };

    Object obj = (My_func) (() -> { // 앞에 (Object) 생략 가능
    });

    String str = ((Object) (My_func) (() -> {
    })).toString();

    System.out.println(f);
    System.out.println(obj);
    System.out.println(str);

    // System.out.println(() -> {});
    System.out.println((My_func) (() -> {
    }));

  }

}
