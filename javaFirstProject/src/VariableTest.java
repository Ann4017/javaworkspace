

public class VariableTest {

  public static void main(String[] args) {
    // 변수
    // 형식 : 타입 + 변수 명
    // 정수, 실수, 논리값, 문자
    // byte, char, short, int, long : 정수
    // float, double : 실수
    // boolean : 논리값
    // 정수 : int 기본 타입
    // 실수 : double 기본 타입

    // int num; // 선언
    // num = 123; // 초기화
    //
    // System.out.println(num);
    //
    // num = 321;
    // System.out.println(num);
    //
    // int x,y,z;
    // x = 1;
    // y = 2;
    // z = 3;
    // System.out.println(x+" "+y+" "+z);
    //
    // int a = 10, b = 20, c = 30;
    // System.out.println(a+b+c);
    //
    // boolean tf = false; // or true
    // System.out.println(tf);
    //
    // byte by = 12;
    // System.out.println(by);
    //
    // char ch = 'a';
    // System.out.println(ch);
    //
    // short sh = 312;
    // System.out.println(sh);
    //
    // long lo = 2222222222222222222L; // or l
    // System.out.println(lo);
    //
    // float fl = -3.142f; // or F 기입하지 않을 시 더블형으로 인식함
    // System.out.println(fl);
    //
    // double db = 3.14; // or d, D
    // System.out.println(db);
    //
    // char cha = 'a';
    // String st1 = "bc";
    // System.out.println(cha+""+st1);


    String s_cow = "한우", s_pish = "참치", s_max = "맥스봉";
    int i_cow_price = 112500, i_pish_price = 25500, i_max_price = 500;
    System.out.println("품명:" + s_cow + ",  가격:" + i_cow_price + "원");
    System.out.println("품명:" + s_pish + ",  가격:" + i_pish_price + "원");
    System.out.println("품명:" + s_max + ",  가격:" + i_max_price + "원");

    // 형식문자 : %d(정수), %f(실수), %c(문자), %s(문자열)

    System.out.printf("품명: %-10s, 가격: %8d \n", s_cow, i_cow_price);
    System.out.printf("품명: %-10s, 가격: %8d \n", s_pish, i_pish_price);
    System.out.printf("품명: %-10s, 가격: %8d \n", s_max, i_max_price);


  }

}
