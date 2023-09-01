package com.javachobo.exception;

import java.util.Scanner;

public class age_err_test {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("나이를 입력 해주세요.");
    int input_age = sc.nextInt();

    try {
      if (input_age < 20) {
        throw new age_err(input_age + "살 미성년자 입니다.");
      } else {
        System.out.printf("%d살 성인 입니다. ", input_age);
      }

    } catch (age_err e) {
      System.out.println(e.getMessage());
    }

  }

}
