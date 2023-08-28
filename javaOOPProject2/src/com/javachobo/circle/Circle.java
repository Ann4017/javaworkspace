package com.javachobo.circle;

public class Circle {

  public double r;

  public Circle(double r) {
    this.r = r;
  }

  public double get_area() {
    return r * r * 3.14;
  }

}
