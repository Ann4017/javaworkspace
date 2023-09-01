package com.javachobo.etc;

import java.util.Random;

public class Wrapper_test {

  public static void main(String[] args) {

    // ����Ŭ���� (�⺻�� 8��)
    // �⺻���� ������ �� �� ����ȯ�� �ϱ� ���ؼ�
    // ����ڽ� (�ڽ�, ��ڽ�)

    // boolean -> Boolean
    // int -> Integer
    // byte -> Byte

    int i = 10;
    Integer it = new Integer(i); // ���������� �ڽ�

    int i2 = 20;
    Integer it2 = i2; // Integer it2 = (Integer)i2; // ĳ���� �����ڴ� ������ ������

    int i3;
    Integer it3 = new Integer(30);
    i3 = (int) it3; // �������� �⺻������ ��ڽ�

    System.out.println(i + it3);


    Object obj = i; // ����ڽ� -> Integer(i)

    // i = obj; // err

    String.valueOf(100); // ���ڸ� ���ڿ���
    Integer.parseInt("100"); // ���ڿ��� ���ڷ�


    // Random Ŭ����
    Random ran = new Random();
    ran.nextInt(10); // 0 ~ 9 ������ ����
    ran.nextDouble(); // 0.0 <= x < 1.0
    ran.nextBoolean();

  }

}
