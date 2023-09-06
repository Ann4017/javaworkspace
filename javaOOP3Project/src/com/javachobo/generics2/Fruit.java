package com.javachobo.generics2;

public class Fruit {


  String name;
  int weight;

  public Fruit(String name, int weight) {
    super();
    this.name = name;
    this.weight = weight;
  }

  @Override
  public String toString() {
    return name + "(" + weight + ")";
  }

}
