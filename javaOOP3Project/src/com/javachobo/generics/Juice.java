package com.javachobo.generics;

public class Juice {

  String name;

  public Juice(String name) {
    super();
    this.name = name + "Juice";
  }

  @Override
  public String toString() {
    return "Juice [name=" + name + "]";
  }


}
