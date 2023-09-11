package com.javachobo.lamda;

import java.util.ArrayList;
import java.util.Arrays;

public class lamda {

  // int max(int x, int y) {
  // return x > y ? x : y;
  // }

  // 이름이 없는 메소드 (lamda)
  // (int x, int y) -> {return x > y ? x : y} return 을 사용 했을 때는 중괄호로 묶어줘야 한다.
  //
  // (int x, int y) -> x > y ? x : y
  //
  // x, y -> x > y ? x : y
  //
  // x -> x * x // 매개변수라 1개인 경우에 가능한 식

  // 이름없는 함수를 사용하기 위해
  // 함수형 인터페이스가 필요하다. (람다식을 사용하기 위한 전용 인터페이스)
  // 추상메소드는 반드시 하나만 작성한다.
  // @FunctionalInterface 하나만 작성 할 수 있게 제한을 한다.

  // 익명 클래스
  // new Object () {
  // int max(int x, int y) {
  // return x > y ? x : y;
  // }
  // }

  // 타입 f = (int x, int y) -> x > y ? x : y
  // int max = f.max(10, 20);

  @FunctionalInterface
  interface my_func {
    int max(int x, int y);
  }


  my_func f = (int x, int y) -> x > y ? x : y;
  int max = f.max(10, 20);

  //
  ArrayList<String> list = (ArrayList<String>) Arrays.asList("aaa", "bbb");

}
