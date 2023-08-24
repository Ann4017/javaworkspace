
public class FactorTest {

  public static void main(String[] args) {

    // int fac = 1;
    // for (int i = 1; i <= 5; i++) {
    // fac *= i;
    // }
    // System.out.println(fac);


    int fac = fac(5);
    System.out.println(fac);
  }

  // 재귀호출
  // 무한반복
  // 매개변수가 종료시점 결정
  // 조건문 사용
  // return문 사용

  static int fac(int n) {
    int result = 0;

    if (n == 1) {
      return 1;
    } else {
      result = n * fac(n - 1);
    }
    return result;
  }

}
