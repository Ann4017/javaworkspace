package com.javachobo.enums;

public enum Week { // enum : ���� �� ���


  MONDAY("��"), TUESDAY("ȭ"), WEDNESDAY("��"), THURSDAY("��"), FRIDAY("��"), SATURDAY("��"), SUNDAY("��");

  // �������� ��ü
  // �ν��Ͻ� ������ ���� �� �ִ�.
  // �����ڸ� ������ �� �ִ�.

  public String getKor() {
    return kor;
  }


  private String kor;

  Week(String kor) {
    this.kor = kor;
  }

}
