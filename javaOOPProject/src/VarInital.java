
public class VarInital {
  // 멤버 변수의 초기화
  // 자동 초기화 - 강제초기화 - 생성자 - 초기화블록

  int x; // 0
  int y = 10;

  VarInital() {
    x = 20;
  }

  int iv;
  static int cv;

  {
    iv = 10;
  }

  static {
    cv = 20;
  }


}
