import java.util.Arrays;

public class Function {

  // 속성

  // 기능 (메소드)

  // 리턴타입 메소드이름([매개변수...]) {
  // 실행문
  // [return 리턴 값]
  // }


  // 예)
  // 리턴타입 : void, 기본형타입(8가지), 참조형
  // 메소드 이름 : 작명
  // 매개변수 : 변수 (int x)
  // 실행문 : System.out.println();
  // return : 리턴 값 => x + y ...

  void add() { // 메소드 정의
    System.out.println(3 + 4);
  }

  void add2(int x, int y) {
    System.out.println(x + y);
  }

  int add3(int x, int y) {
    int sum = x + y;
    return sum;
  }

  int sub(int x, int y) {
    int sum = x - y;
    return sum;
  }

  int mul(int x, int y) {
    int sum = x * y;
    return sum;
  }

  double div(int x, int y) {
    double sum = x / (double) y;
    return sum;
  }


  // return
  // 메소드의 즉시종료
  // 리턴타입 void인 경우

  void func(int x) {
    if (x < 10) {
      System.out.println("fail");
      return; // 조건에 충족시 즉시 종료
    }
    System.out.println("funk");
  }

  int func1(int x, int y) {
    // if (x > y) {
    // return x;
    // } else {
    // return y;
    // }

    if (x > y) {
      return x;
    }
    return y;
  }

  // 매개변수의 유효성 검사

  float div2(int x, int y) {
    // 나누기 할 때 정수를 0으로 나누면 안된다.
    // 23 / 0 (error)

    if (y == 0) {
      return 0;
    }
    return x / (float) y;
  }


  void defultArg(int x, int y) {
    x = 100;
    y = 200;
    System.out.println(x + " ," + y);
  }

  void refArg(int[] arr) {
    arr[0] = 100;
    System.out.println("refArg에서 출력");
    System.out.println(Arrays.toString(arr));
  }

}
