package com.javachobo.exception;

public class Exception_test2 {
  public static void main(String[] args) {

    // 예외 강제로 발생 시키기
    try {
      Exception e = new Exception("예외 발생"); // 일부로 에러를 발생 시키는 경우
      throw e;
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
