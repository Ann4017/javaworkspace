package com.javachobo.etc;

public class Value_test {

  public static void main(String[] args) {

    Value v1 = new Value(10);
    Value v2 = new Value(10);

    if (v1 == v2) { // �ּҰ� ��
      System.out.println("���� ��ü o");
    } else {
      System.out.println("���� ��ü x");
    }

    if (v1.equals(v2)) { // equals �������̵��� ���� ��ü�� �� �񱳷� ������
      System.out.println("���� ��ü o");
    } else {
      System.out.println("���� ��ü x");
    }

    System.out.println(v1.hashCode()); // ��ü�� �ؽ� ���� ��
    System.out.println(v2.hashCode());
  }

}
