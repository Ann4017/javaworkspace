package com.javachobo.lamda;

public class Lamda_test2 {

  public static void main(String[] args) {

    // �Լ��� �������̽��� ����ȯ
    // Object �� ���� ����ȯ �Ұ�
    // (Object) (() -> {}) x
    // �Լ��� �������̽��� ����ȯ �� Object Ÿ������ ��ȯ����

    My_func f = () -> {
    };

    Object obj = (My_func) (() -> { // �տ� (Object) ���� ����
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
