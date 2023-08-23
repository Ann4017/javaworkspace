

public class LoopTest {

  public static void main(String[] args) {

    // for, while, do~while

    // for(초기값;조건식;증감값) {
    // 실행문;
    // }

    // for (int i = 1; i <= 10; i++) {
    // System.out.println(i + " hi~");
    // }

    // for (int i = 1; i <= 10; i += 2) {
    // System.out.println(i + "hi~");
    // }

    // for (int i = 10; i >= 1; i--) {
    // System.out.println(i + "hi~");
    // }

    // for (int i = 1, j = 10; i <= 10; i++, j--) {
    // System.out.printf("i:%d, j:%d\n", i, j);
    // }

    // for (;;) {
    // //무한루프
    // }
    // for (;true;) {
    // //무한루프
    // }

    // int result = 0;
    // for (int i = 1; i <= 10; i++) {
    // result += i;
    // }
    // System.out.println(result);

    // int result = 1;
    // for (int i = 1; i <= 5; i++) {
    // result *= i;
    // }
    // System.out.println(result);


    // 1-2+3-4+5.....-10

    // int result = 0;
    // for (int i = 1; i <= 10; i++) { //if문 사용 o
    // if (i % 2 == 0) {
    // result += -i;
    // } else {
    // result += i;
    // }
    // }
    // System.out.println(result);

    // int sum = 0;
    // int s = 1;
    //
    // for (int i = 1; i <= 10; i++, s = -s) { // if문을 사용 x
    // sum += (i * s);
    // }
    // System.out.println(sum);


    // for (int i = 1; i <= 30; i++) { //반복되는 패턴
    // System.out.println(i / 3 + "," + i % 3);
    // }


    // 초기값
    //
    // while(조건식) {
    // 실행문
    // 증감식
    //
    // }

    // int i = 1;
    //
    // while (i <= 10) {
    // System.out.println(i + " hi~");
    // i++;
    // }

    // int i = 1;
    // while (i <= 10) {
    // System.out.println(i);
    // i += 2;
    // }

    // int i = 10;
    // while (i >= 1) {
    // System.out.println(i);
    // i--;
    // }

    // int sum = 0;
    // int i = 1;
    // while (i <= 10) {
    // sum += i;
    // i++;
    // }
    // System.out.println(sum);

    // while (true) {
    // //무한 반복문
    // //대체적으로 무한 반복문은 for문 보단 while문을 사용한다.
    // }

    // 중첩 반복문
    // for() { //5
    // for() { //3
    // 실행문 //5 * 3 == 15
    // }
    // }

    // int num = 0;
    //
    // for (int i = 1; i <= 5; i++) {
    // for (int j = 1; j <= 3; j++) {
    // System.out.println("i = " + i + ", j = " + j);
    // }
    // }

    // for (int i = 0; i <= 5; i++) {
    // System.out.println();
    // for (int j = 1; j <= 5; j++) {
    // System.out.print("*");
    // }
    // }

    // for (int i = 1; i <= 5; i++) { // i = 1, 2, 3, ,4, 5
    // for (int j = 1; j <= i; j++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }

    // for (int i = 1; i <= 5; i++) { // i = 1, 2, 3, 4, 5
    // for (int j = 1; j <= 5; j++) {
    // // 공백
    // // 별
    // if (i + j < 6) {
    // System.out.print(" ");
    // } else {
    // System.out.print("*");
    // }
    // }
    // System.out.println();
    // }

    // for (int i = 1; i <= 5; i++) {
    // for (int j = 0; j <= 5; j++) {
    // if (i + j < 6) {
    // System.out.print("*");
    // } else {
    // System.out.print(" ");
    // }
    //
    // }
    // System.out.println();
    // }
    //
    // for (int i = 1; i <= 5; i++) {
    // for (int j = 1; j <= 5; j++) {
    // if (j - i < 0) {
    // System.out.print(" ");
    // } else {
    // System.out.print("*");
    // }
    // }
    // System.out.println();
    // }

    // for (int i = 1; i <= 5; i++) {
    // for (int j = 1; j <= 10; j++) {
    // if (i + j > 5 && j - i < 5) {
    // System.out.print("*");
    // } else {
    // System.out.print(" ");
    // }
    // }
    // System.out.println();
    // }
    //
    // for (int i = 1; i <= 5; i++) {
    // for (int j = 1; j < i + 5; j++) {
    // if (i + j < 6) {
    // System.out.print(" ");
    // } else {
    // System.out.print("*");
    // }
    // }
    // System.out.println();
    // }
    //
    //
    // // 이중 while문
    // int i = 1;
    // while (i <= 10) {
    // int j = 1;
    // while (j <= 10) {
    // System.out.print("*");
    // j++;
    // }
    // System.out.println();
    // i++;
    // }

    // for (int i = 1; i <= 10; i++) {
    // for (int j = 1; j < i + 5; j++) {
    // if (i + j < 6) {
    // System.out.print(" ");
    // } else if (i + j > 14 || i - j >= 5) {
    // System.out.print(" ");
    // } else {
    // System.out.print("*");
    // }
    // }
    // System.out.println();
    // }


    // 반복문의 제어
    // break : 즉시 종료
    // continue : 실행문의 제어
    // 조건문 (if)이 같이 사용해야한다.
    // 현재 명령어를 실행하는 반복문을 제어한다.

    // for (int i = 1; i <= 10; i++) {
    // if (i > 5) {
    // break;
    // }
    // System.out.println("hi");
    // }


    // for (int i = 1; i <= 10; i++) {
    // if (i % 2 == 0) {
    // continue;
    // }
    // System.out.println(i);
    // }



    // Scanner sc = new Scanner(System.in);
    //
    // while (true) {
    // System.out.println("정수 입력:");
    // int choice = sc.nextInt();
    // System.out.println("hi");
    // if (choice == 5) {
    // System.out.println("종료");
    // break;
    // }
    // }


    // boolean flag = true;
    // Scanner sc = new Scanner(System.in);
    //
    // while (flag) {
    // System.out.println("숫자 입력");
    // int choice = sc.nextInt();
    // System.out.println("hi");
    // if (choice == 5) {
    // flag = false;
    // System.out.println("종료");
    // }
    //
    // }


    // 두자리 이상의 정수를 입력 받는다. 34564
    // 각 숫자의 자리수의 합을 구한다. 3+4+5+6+4 = 22
    // 결과 출력

    // Scanner sc = new Scanner(System.in);
    // System.out.println("두자리 이상의 정수를 입력 해주세요.");
    // int i_num = sc.nextInt();
    // int i_sum = 0;
    //
    // while (i_num != 0) {
    // i_sum += i_num % 10;
    // i_num /= 10;
    // }
    // System.out.println(i_sum);


    // do {
    // 실행문
    // }while(조건식);
    // 조건과 상관없이 무조건 한번은 실행된다.

    // int x = 111;
    //
    // do {
    // System.out.println(x);
    // x--;
    // } while (x > 100);


    for (int i = 1; i <= 9; i++) {
      for (int j = 1; j <= 3; j++) {
        int x = j + 1 + (i - 1) / 3 * 3;
        int y = i % 3 == 0 ? 3 : i % 3;

        if (x > 9) {
          break;
        }

        System.out.printf("%d*%d=%d  ", x, y, x * y);
      }
      System.out.println();
      if (i % 3 == 0) {
        System.out.println();
      }
    }

  }
}
