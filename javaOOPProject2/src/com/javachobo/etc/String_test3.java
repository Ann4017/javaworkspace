package com.javachobo.etc;

public class String_test3 {

  public static void main(String[] args) {

    // StringBuffer, StringBuilder 동기화 유/무 의 차이

    StringBuffer sb = new StringBuffer(); // String 과 다르게 바로 값을 넣어 줄 수 없다.
    System.out.println(sb);

    sb.append("123"); // 추가 하는 메소드
    System.out.println(sb);

    String str;
    str = sb.toString(); // StringBuffer 와 String 은 서로 다른 타입이다. // 직접적인 형변환은 불가하다. (str =
                         // (String)sb;)
    // new String(toStringCache) 오버라이딩 을 통해 캐스팅의 역할로 재정의가 되어야한다.

  }

}
