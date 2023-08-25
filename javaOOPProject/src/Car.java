
public class Car {

  // 속성
  String color;
  String gearType;
  int door;


  // 생성자
  // 객체를 생성한다. ***
  // 멤버 변수의 초기화(인스턴스 변수) ***
  // 오버로딩이 가능하다.
  // 오버로딩 시 기본 생성자 생략이 불가하다.
  // 클래스의 이름과 똑같이 만든다.
  // 객체를 생성 할 때 딱 한번 호출 된다.
  // 기본 생성자 (생성자가 없을 때 생략가능) Car(){}
  // 생성자 간 의 호출이 가능하다. this()
  Car() {
    this("white", "수동", 2);
  }

  Car(String color) { // 멤버변수와 매개변수의 이름이 같은 경우 멤버변수임을 구별하기 위해 this. 을 사용한다.
    this(color, "수동", 2);
  }

  Car(String color, String gearType, int door) {
    this.color = color;
    this.gearType = gearType;
    this.door = door;
  }



  // 기능


}
