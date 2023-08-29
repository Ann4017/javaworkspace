package com.javachobo.interfaces;

public class Unit {

  int i_hit_point;
  final int I_MAX_HP; // 상수 멤버 변수는 생성자를 통해서 초기화가 가능하다.

  Unit(int i_hp) {
    I_MAX_HP = i_hp;
  }
}
