package com.javachobo.polym;

public class Car {

  // 다형성
  // 클래스 간 관계를 이용해서 객체를 사용하는 것
  // 클래스 간 상속 관계과 전제 되어야 한다.

  String color;
  int door;

  void driver() {
    System.out.println("driver");
  }

  void stop() {
    System.out.println("stop");
  }
}
