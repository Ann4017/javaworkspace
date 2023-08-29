package com.javachobo.interfaces;

public class Apt1 implements Info_able {

  @Override
  public void price() {
    System.out.println("가격 : 100만원");

  }

  @Override
  public void size() {
    System.out.println("평수 : 30평");

  }

}
