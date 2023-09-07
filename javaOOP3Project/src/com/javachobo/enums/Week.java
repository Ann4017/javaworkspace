package com.javachobo.enums;

public enum Week { // enum : 제한 된 상수


  MONDAY("월"), TUESDAY("화"), WEDNESDAY("수"), THURSDAY("목"), FRIDAY("금"), SATURDAY("토"), SUNDAY("일");

  // 열거형의 객체
  // 인스턴스 변수를 가질 수 있다.
  // 생성자를 정의할 수 있다.

  public String getKor() {
    return kor;
  }


  private String kor;

  Week(String kor) {
    this.kor = kor;
  }

}
