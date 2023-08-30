package com.javachobo.etc;

public class String_test {

  public static void main(String[] args) {

    // String str = "a";
    // String str2 = new String("a");

    String str = "abcd";
    // abcd 같은 문자열에는 0123 같이 인덱스 번호가 붙는다.

    char c = str.charAt(3); // 문자열에서 하나의 문자를 가져올 수 있지만 반환 값은 char 이다.
    System.out.println(c);

    int idx = str.indexOf('d'); // 반대로 문자열에 속한 문자의 인덱스 번호를 가져오는 기능 이다 (반환 int).
    int idx2 = str.indexOf(c);
    System.out.println(idx);
    System.out.println(idx2);

    int len = str.length(); // 전체 문자열의 길이를 확인 하는 기능
    System.out.println(len);

    String re = str.replace('c', 'C'); // 기존의 문자열에서 문자를 교체하는 기능
    System.out.println(re);

    String animals = "dog, cat, bear"; // 문자열 안에서 지정 한 문자열을 기준으로 나누어서 배열로 만드는 기능
    String[] ani = animals.split(", ");

    for (String s : ani) { // 향상 된 for 문; for(배열의 값을 넣어줄 타입과 변수 : 반복 할 배열)
      System.out.println(s);
    }

    // boolean b = str.startsWith("dog"); // 문자열의 시작하는 문자열을 확인 (반환 값은 boolean 이다)
    if (animals.startsWith("dog")) { // 반대는 animals.endsWith()
      System.out.println("dog 로 시작하는 문자열");
    } else {
      System.out.println("dog 로 시작하지 않는 문자열");
    }

    // substring(시작 인덱스, 마지막 인덱스+1) 문자열 안 에서 지정한 문자열을 가져오는 기능
    String str2 = "java.chobo.com";
    System.out.println(str2.substring(5, 10));
    String s = str2.substring(5, 10);
    System.out.println(s);

    int i = 100;
    String iv = String.valueOf(i); // 기본형을 문자열로 바꿔주는 기능 // i + "" 와 기능은 같다
    System.out.println(iv);

    String s1 = "hello";
    System.out.println(s1);
    System.out.println(s1.toString()); // toString 이 오버라이딩 되며 자동 생략 되었기 때문에 주소값이 아닌 값이 출력 된다.

    String ss1 = "hello";
    String ss2 = "hello";
    if (ss1.equals(ss2)) { // 문자열 비교는 == 등호 비교가 불가능하고 equals()를 사용해야 한다.
      System.out.println("같다");
    } else {
      System.out.println("다르다");
    }
  }

}
