package com.javachobo.interfaces;

public interface Moveable {

  // 생성불가
  // 일반적인 멤버는 정의 불가
  // 인터페이스 간 상속이 가능하다.(다중 상속 가능)
  // 클래스에 상속(구현)되어야 한다.(오버라이딩 필수)
  // 예)
  // [public static final] 상수형;
  // [public abstract] 리턴값 메소드명;
  // [] : 제어자 (생략 가능)

  void move();
}
