package com.javachobo.etc;

public class Value_test {

  public static void main(String[] args) {

    Value v1 = new Value(10);
    Value v2 = new Value(10);

    if (v1 == v2) { // 주소값 비교
      System.out.println("같은 객체 o");
    } else {
      System.out.println("같은 객체 x");
    }

    if (v1.equals(v2)) { // equals 오버라이딩을 통해 객체의 값 비교로 재정의
      System.out.println("같은 객체 o");
    } else {
      System.out.println("같은 객체 x");
    }

    System.out.println(v1.hashCode()); // 객체의 해시 고유 값
    System.out.println(v2.hashCode());
  }

}
