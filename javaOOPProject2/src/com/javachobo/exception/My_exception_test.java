package com.javachobo.exception;

public class My_exception_test {

  public static void main(String[] args) {

    try {
      throw new My_exception();
    } catch (My_exception e) {
      System.out.println(e.getMessage());
    }

  }

}
