package com.javachobo.abstracts;

public abstract class Player {

  // 생성 불가
  // 상속만 가능
  // 추상 메소드가 존재한다. (선언 부 만 존재한다. 구현 부x) abstract 리턴타입 메소드명();
  // 자식 클래스에서 반드시 오버라이딩 해야한다.
  int x;
  int y;


  abstract void play(int pos);

  abstract void stop();

}
