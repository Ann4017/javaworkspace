package com.javachobo.enums;

public enum Single_ton_enum {

  INSTANCE; // �̱��� �̴� ���� Ű���� (�����ϱ� ���� ������� ����

  int value;

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }



}
