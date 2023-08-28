package com.javachobo.circle;

public class Singleton {

  // �̱��� ���� (�ܺο��� ��� �� �� ����)
  // �����ڰ� private �� Ŭ����
  // ��ü�� �ϳ� �� ���� �� �� �ִ�. (������� �ּҰ��� ����.)

  private static Singleton s = new Singleton();

  private Singleton() {

  }

  public static Singleton getInstance() {
    return s;
  }

  public static void print() {
    System.out.println("singleton print");
  }
}

