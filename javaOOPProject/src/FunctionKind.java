
public class FunctionKind {

  // 속성

  // 기능(메소드)
  // 인스턴스
  // 클래스 (생성 없이 사용가능)
  // 생성 유/무와 상관없이 사용가능


  // void add() { // 인스턴스
  // System.out.println(3 + 5);
  //
  // }
  //
  // static void sub() { // 클래스(스태틱)메소드
  // System.out.println(6 - 2);
  //
  // }


  // 클래스멤버와 인스턴스한 멤버를 참조관계
  // 클래스 : 생성 후 메모리 할당
  // 스태틱 : 가장 먼저 메모리 할당

  int iv;
  static int cv;

  void instanceMethod() {
    iv = 10;
    cv = 20; // 인스턴스안에서는 스태틱도 사용이 가능하다 스태틱이 먼저 메모리에 할당 되기 때문에
  }

  void instanceMethod2() {
    instanceMethod();
    staticMethod();
  }

  static void staticMethod() {
    // iv = 20; 사용 불가
    cv = 30;
  }

  static void staticMethod2() {
    // instanceMethod(); 사용 불가
    staticMethod();
  }


}
