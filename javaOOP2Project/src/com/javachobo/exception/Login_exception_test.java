package com.javachobo.exception;

import java.util.Scanner;

public class Login_exception_test {
  public static void main(String[] args) {
    String id = "test1234";
    String pwd = "1234";

    Scanner sc = new Scanner(System.in);

    System.out.println("id �Է��ϼ���.");
    String input_id = sc.nextLine();
    System.out.println("pwd �Է��ϼ���");
    String input_pwd = sc.nextLine();


    try {
      if (!(id.equals(input_id) && pwd.equals(input_pwd))) {
        throw new Login_exception("id, pwd �� ��ġ");
      } else {
        System.out.println("Login pass");
      }
    } catch (Login_exception e) {
      System.out.println(e.getMessage());
      System.out.println("id, pwd �� �ٽ� Ȯ�� ���ּ���");
    }

  }

}
