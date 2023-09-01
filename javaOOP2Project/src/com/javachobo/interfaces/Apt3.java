package com.javachobo.interfaces;

public class Apt3 implements Info_able {

  @Override
  public void price() {
    System.out.println("가격 : 25만원");

  }

  @Override
  public void size() {
    System.out.println("평수 : 10평");

  }
}
