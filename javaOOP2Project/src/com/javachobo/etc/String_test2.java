package com.javachobo.etc;

public class String_test2 {

  public static void main(String[] args) {

    // 파일의 제목과 확장자를 각각 가져오는 방법
    String file_name = "Hello.java";

    int idx = file_name.indexOf('.');

    String fn = file_name.substring(0, idx);
    String ext = file_name.substring(idx + 1);

    System.out.println(fn);
    System.out.println(ext);


    String str = "ababaccaa";
    int num = 0;
    String[] aa = str.split("");


    // for (String a : aa) {
    // if (a == aa[0]) {
    // num++;
    // }
    // }

    // for (int i = 0; i < aa.length; i++) {
    // if (aa[i].equals("a")) {
    // num++;
    // }
    // }

    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if (c == 'a') {
        num++;
      }
    }
    System.out.println("a의 개수 : " + num);
  }



}
