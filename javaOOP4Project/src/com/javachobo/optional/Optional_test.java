package com.javachobo.optional;

import java.util.Optional;

public class Optional_test {

  public static void main(String[] args) {

    // Optional
    // ��ü�� ���δ� ���� Ŭ����
    // ��ü ���� null ��/�� �� �Ǵ��ϴ� �뵵�� ���

    // �⺻ ���
    // String str = null;
    //
    // if (str != null) {
    //
    // }


    // String str = "abc";
    //
    // Optional<String> opt_val = Optional.of(str);
    //
    // String result = opt_val.get(); // ���׸� Ÿ���� ��ȯ
    //
    // System.out.println(result);


    // String str = null;

    // Optional<String> opt_val1 = Optional.of(str); // null �̶�� ����
    // Optional<String> opt_val2 = Optional.ofNullable(str); // null �̶�� ���� ó��


    // String str = "abc";
    // Optional<String> opt_val = Optional.of(str);
    // String r_str1 = opt_val.get();
    // String r_str2 = opt_val.orElse(""); // opt_val ���� null �̸� �� ���ڿ��� ��ȯ.
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
    String result2 = Optional.ofNullable(str).orElse("���� ������ �ƴϴ�");
    System.out.println(result2);

  }

}
