package com.javachobo.exception;

import java.util.Scanner;

public class age_err_test {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("���̸� �Է� ���ּ���.");
    int input_age = sc.nextInt();

    try {
      if (input_age < 20) {
        throw new age_err(input_age + "�� �̼����� �Դϴ�.");
      } else {
        System.out.printf("%d�� ���� �Դϴ�. ", input_age);
      }

    } catch (age_err e) {
      System.out.println(e.getMessage());
    }

  }

}
