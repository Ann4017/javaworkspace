
public class Tv {
  // 속성
  // 멤버변수
  // 자동초기화

  // 기본형
  // 정수 : byte, short, int, long = 0
  // 실수 : double = 0.0, float = 0.0f
  // 논리값 : boolean = false
  // 문자 : char = ' '

  // 참조형
  // 초기값 : null
  // String = null

  String color;
  boolean power;
  int channel;

  // 기능

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
