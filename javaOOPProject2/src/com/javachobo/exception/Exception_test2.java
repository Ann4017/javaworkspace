package com.javachobo.exception;

public class Exception_test2 {
  public static void main(String[] args) {

    // ���� ������ �߻� ��Ű��
    try {
      Exception e = new Exception("���� �߻�"); // �Ϻη� ������ �߻� ��Ű�� ���
      throw e;
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
