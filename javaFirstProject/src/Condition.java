
public class Condition {

  public static void main(String[] args) {

    // 조건문
    // if, swith, case

    // if(조건식) {
    // //실행문
    // }
    // int i_age = 21;

    // if (i_age >= 20) {
    // System.out.println("성인 입니다.");
    // } else {
    // System.out.println("미성년자 입니다.");
    // }
    // }

    // int i_score = 40;
    // if (i_score >= 80) {
    // System.out.println("A등급");
    // } else if (i_score >= 60) {
    // System.out.println("B등급");
    // } else {
    // System.out.println("C등급");
    // }
    // }

    // double random = Math.random();
    // int result = (int) (random * 101);
    // System.out.println(result);


    // 중첩 if문
    // if (조건식) {
    // if (조건식) {
    //
    // } else {
    //
    // }
    // }

    // int x = 6;

    // if (x % 2 == 0) {
    // System.out.println(x + "는 2의 배수 이다.");
    // if (x % 3 == 0) {
    // System.out.println(x + "는 2와 3의 공배수 이다.");
    // }
    // } else {
    // System.out.println(x + "는 2와 3의 공배수가 아닙니다.");
    // }


    // if (x % 2 == 0 x % 3 == 0) {
    // System.out.println(x + "는 2와 3의 공배수 이다.");
    // } else {
    // System.out.println(x + "는 2와 3의 공배수가 아닙니다.");
    // }


    // int score = 93;
    // if (score >= 90) {
    // if (score >= 95) {
    // System.out.println("a+");
    // } else if (score >= 92) {
    // System.out.println("a");
    // } else {
    // System.out.println("a-");
    // }
    // } else if (score >= 70) {
    // System.out.println("b");
    // } else if (score >= 60) {
    // System.out.println("c");
    // } else if (score >= 50) {
    // System.out.println("d");
    // } else {
    // System.out.println("f");
    // }

    // 같은 값을 비교, default는 생략이 가능하다.
    // switch (비교값) { //비교값 : 정수, 문자, 문자열
    // case 값1: 실행문
    //
    // break;
    // case 값2: 실행문
    //
    // break;
    // case 값3: 실행문
    //
    // break;
    //
    // default:실행문
    // break;
    // }


    // int x = 2;
    //
    // switch (x) {
    // case 1:
    // System.out.println(x + "는 1과 같다.");
    // break;
    // case 2:
    // System.out.println(x + "는 2과 같다.");
    // break;
    // case 3:
    // System.out.println(x + "는 3과 같다.");
    // break;
    // default:
    // System.out.println(x + "와 같지 않다.");
    // break;
    // }

    // char x = 'b';
    //
    // switch (x) {
    // case 'a':
    // System.out.println(x + "의 유니코드는 " + (int) x);
    // break;
    // case 'b':
    // System.out.println(x + "의 유니코드는 " + (int) x);
    // break;
    // case 'd':
    // System.out.println(x + "의 유니코드는 " + (int) x);
    // break;
    // default:
    // System.out.println(x + "잘못 입력하셨습니다.");
    // break;
    // }


    // String str = "aaa";
    //
    // switch (str) {
    // case "aaa":
    // System.out.println(str + "a");
    // break;
    // case "bbb":
    // System.out.println(str + "b");
    // break;
    // case "ccc":
    // System.out.println(str + "c");
    // break;
    // default:
    // System.out.println(str + "잘못 입력 하였습니다.");
    // break;
    // }


    // int x = 2;
    //
    // switch (x) {
    // case 1:
    // case 4:
    // System.out.println("1, 4");
    // break;
    // case 2:
    // case 5:
    // System.out.println("2, 5");
    // break;
    // case 3:
    // case 6:
    // System.out.println("3, 6");
    // break;
    // default:
    // System.out.println("....");
    // break;
    // }


    // 가위(1) 바위(2) 보(3)
    // 키보드를 통한 값의 입력
    // Scanner 클래스 (사용 전 import 필요)
    // Scanner sc = new Scanner(System.in);
    // System.out.println("정수 하나를 입력하세요 :");
    // int i_num = sc.nextInt();
    // if (i_num < 0) {
    // System.out.println("잘못 되었습니다. 정수를 입력해 주세요 : ");
    // } else {
    // System.out.println("입력한 정수는 :" + i_num);
    // }


    // 컴퓨터가 사용하는 난수(랜덤값)생성
    // Math 클래스

    // int ran = (int) (Math.random() * 10 + 1);
    //
    // System.out.println(ran);


    // Scanner sc = new Scanner(System.in);
    // String s_choice = sc.nextLine();
    // int ran = (int) (Math.random() * 3 + 1);
    // String s_com1, s_com2, s_com3;
    //
    // System.out.println("가위, 바위, 보 세가지 중 하나를 입력 하세요.");
    // if (s_choice == String) {
    // System.out.println("나 : " + s_choice);
    // } else {
    // System.out.println("잘못 입력하셨습니다. 다시 입력 하세요.");
    // }



    // System.out.println("가위(1), 바위(2), 보(3) 중 한가지를 입력하세요.");
    // Scanner sc = new Scanner(System.in);
    //
    // int i_me = sc.nextInt();
    // int i_com = (int) (Math.random() * 3 + 1);
    // int i_result = i_me - i_com;
    //
    // System.out.println("me : " + i_me);
    // System.out.println("com : " + i_com);
    //
    // switch (i_result) {
    // case 2:
    // case -1:
    // System.out.println("Lose");
    // break;
    // case 1:
    // case -2:
    // System.out.println("Win");
    // break;
    // case 0:
    // System.out.println("Tie");
    // default:
    // System.out.println("잘못 입력 하셨습니다.");
    // break;
    // }



  }
}


