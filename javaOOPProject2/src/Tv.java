
public class Tv {
  // 상속에서의 부모 클래스 역할
  // 두개 이상의 자식 클래스에 공통으로 사용하는 요소를 정의해서 전달함.
  // 단일 상속
  // oop : 객체지향의 목표 : 코드의 최소화, 유지 보수
  // 모든 클래스는 Object 라는 조상 클래스를 상속 받는다.


  String color;
  boolean power;
  int channel;


  void channel_up() {
    channel++;
  }

  void channel_down() {
    channel--;
  }

  void power() {
    power = !power;
  }


}

