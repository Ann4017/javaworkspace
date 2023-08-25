
public class MethodOvering {
  // 오버로딩 (overloading)
  // 1. 메소드의 이름이 같아야 한다.
  // 2. 매개변수의 개수 또는 타입 중에 하나는 같아서는 안된다.
  // 3. return 타입이 다르다고 해서 오버로딩에 조건이 되지 않는다.

  public static void main(String[] args) {
    System.out.println(); // 오버로딩의 예시) println(); int형, String형, .. 등등
  }

  void add() {}

  void add(int x) {}

  // int add() {}

  void add(double x) {}

  void add(int x, int y) {}

  void add(int x, double y) {}

  void add(double x, int y) {}



}
