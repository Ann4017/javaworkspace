package com.javachobo.modifier;

public class Time {
  // 접근 제어자
  // 클래스 간 참조 범위 (기준은 패키지의 위치)
  // public > protected > default > private
  // public : 모든 패키지의 클래스에서 사용
  // protected : 동일 패키지의 클래스와 다른 패키지 라도 상속관계에 있는 클래스는 사용 가능
  // default : 동일 패키지의 클래스
  // private : 해당 클래스 내 에서만 사용 가능

  // class : public, default
  // var(멤버변수) : public, protected, default, private
  // mathod : public, protected, default, private
  // constructor : public, protected, default, private

  // public int hour;
  // public int min;
  // public int sec;


  // private int hour;
  // private int min;
  // private int sec;

  int hour;
  int min;
  int sec;

  // getter, setter 읽기, 쓰기
  // public 을 쓰지 않으면 외부에서 접근하지 못한다.
  // IDE 좌측 상단 Source 를 통해 get/set 을 손 쉽게 만들 수 있다.

  public int getHour() {
    return hour;
  }

  public void setHour(int hour) {
    this.hour = hour;
  }

  public int getMin() {
    return min;
  }

  public void setMin(int min) {
    this.min = min;
  }

  public int getSec() {
    return sec;
  }

  public void setSec(int sec) {
    this.sec = sec;
  }

  // public void setHour(int hour) {
  // if (hour < 0 || hour > 23) {
  // System.out.println("유효한 범위가 아닙니다.");
  // return;
  // }
  // this.hour = hour;
  // }
  //
  // public int getHour() {
  // return hour;
  // }



}
