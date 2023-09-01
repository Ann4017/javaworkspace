package com.javachobo.circle;

public class Singleton {

  // 싱글톤 패턴 (외부에서 사용 할 수 없게)
  // 생성자가 private 한 클래스
  // 객체를 하나 만 생성 할 수 있다. (만들더라도 주소값은 같다.)

  private static Singleton s = new Singleton();

  private Singleton() {

  }

  public static Singleton getInstance() {
    return s;
  }

  public static void print() {
    System.out.println("singleton print");
  }
}

