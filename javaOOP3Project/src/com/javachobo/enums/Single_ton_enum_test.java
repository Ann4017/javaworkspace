package com.javachobo.enums;

public class Single_ton_enum_test {

  public static void main(String[] args) {

    Single_ton_enum singleton = Single_ton_enum.INSTANCE; // �̱��� �̴� ����
    System.out.println(singleton.getValue());
    singleton.setValue(10);
    System.out.println(singleton.getValue());

  }

}
