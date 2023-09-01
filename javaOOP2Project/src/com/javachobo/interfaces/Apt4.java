package com.javachobo.interfaces;

public class Apt4 implements Info_able {

  @Override
  public void price() {
    System.out.println("가격 : 1000만원");

  }

  @Override
  public void size() {
    System.out.println("평수 : 100평");

  }

}
