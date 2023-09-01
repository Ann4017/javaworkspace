package com.javachobo.circle;

public class SIngletonTest {

  public static void main(String[] args) {
    // Singleton s = new Singleton(); 생성 불가
    Singleton s = Singleton.getInstance();
    Singleton s2 = Singleton.getInstance();

    System.out.println(s);
    System.out.println(s2);

  }

}
