package com.javachobo.optional;

import java.util.Optional;

public class Optional_test {

  public static void main(String[] args) {

    // Optional
    // 객체를 감싸는 래퍼 클래스
    // 객체 값이 null 유/무 를 판단하는 용도로 사용

    // 기본 방식
    // String str = null;
    //
    // if (str != null) {
    //
    // }


    // String str = "abc";
    //
    // Optional<String> opt_val = Optional.of(str);
    //
    // String result = opt_val.get(); // 제네릭 타입을 반환
    //
    // System.out.println(result);


    // String str = null;

    // Optional<String> opt_val1 = Optional.of(str); // null 이라면 에러
    // Optional<String> opt_val2 = Optional.ofNullable(str); // null 이라면 예외 처리


    // String str = "abc";
    // Optional<String> opt_val = Optional.of(str);
    // String r_str1 = opt_val.get();
    // String r_str2 = opt_val.orElse(""); // opt_val 값이 null 이면 빈 문자열을 반환.
    // System.out.println(r_str1);
    // System.out.println(r_str2);

    // new String();
    // String str3 = new String();
    // String str3 = opt_val.orElseGet(String::new); // new String();
    // String str4 = opt_val.orElseThrow(NullPointerException::new);


    String str = "";
    int result = Optional.of(str).filter(x -> x.length() > 0).map(Integer::parseInt).orElse(-1);
    System.out.println(result);

    str = null;
    String result2 = Optional.ofNullable(str).orElse("숫자 구성이 아니다");
    System.out.println(result2);

  }

}
