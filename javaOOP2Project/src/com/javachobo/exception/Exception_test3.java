package com.javachobo.exception;

public class Exception_test3 {

  public static void main(String[] args) {

    // 예외 떠넘기기 (선언하기)
    // 예외는 시작, 중간, 마지막 어느 구간이든 처리를 해주어야한다.
    // 마지막에서도 떠넘겨 버리면 시스템상 처리를 해주지만 원치 않게 처리 해줄 수 있다.


    try { // 떠넘겨 받은 예외 처리
      method1();
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }

  static void method1() throws Exception {
    method2();
  }

  static void method2() throws Exception { // 또 떠넘기기
    method3();
  }

  static void method3() throws Exception { // 예외 떠넘기기 (선언)
    throw new Exception("예외 떠넘기기");

  }

}
