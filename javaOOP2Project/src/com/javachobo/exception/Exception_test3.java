package com.javachobo.exception;

public class Exception_test3 {

  public static void main(String[] args) {

    // ���� ���ѱ�� (�����ϱ�)
    // ���ܴ� ����, �߰�, ������ ��� �����̵� ó���� ���־���Ѵ�.
    // ������������ ���Ѱ� ������ �ý��ۻ� ó���� �������� ��ġ �ʰ� ó�� ���� �� �ִ�.


    try { // ���Ѱ� ���� ���� ó��
      method1();
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }

  static void method1() throws Exception {
    method2();
  }

  static void method2() throws Exception { // �� ���ѱ��
    method3();
  }

  static void method3() throws Exception { // ���� ���ѱ�� (����)
    throw new Exception("���� ���ѱ��");

  }

}
