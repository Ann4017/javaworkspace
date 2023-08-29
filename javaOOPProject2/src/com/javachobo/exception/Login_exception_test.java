package com.javachobo.exception;

import java.util.Scanner;

public class Login_exception_test {
  public static void main(String[] args) {
    String id = "test1234";
    String pwd = "1234";

    Scanner sc = new Scanner(System.in);

    System.out.println("id 입력하세요.");
    String input_id = sc.nextLine();
    System.out.println("pwd 입력하세요");
    String input_pwd = sc.nextLine();


    try {
      if (!(id.equals(input_id) && pwd.equals(input_pwd))) {
        throw new Login_exception("id, pwd 불 일치");
      } else {
        System.out.println("Login pass");
      }
    } catch (Login_exception e) {
      System.out.println(e.getMessage());
      System.out.println("id, pwd 를 다시 확인 해주세요");
    }

  }

}
