package com.javachobo.enums;

public enum Single_ton_enum {

  INSTANCE; // 싱글톤 이늄 생성 키워드 (접근하기 위한 상수값의 역할

  int value;

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }



}
