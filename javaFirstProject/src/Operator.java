

public class Operator {

  public static void main(String[] args) {
    // 연산자
    // 단항연산자, 이항연산자, 삼항연산자
    // 산술연산자 (+, -, *, /, %)

    // int x = 5;
    // int y = 2;
    //
    // System.out.println(x + y);
    // System.out.println(x * y);
    // System.out.println(x / y); //몫
    // System.out.println(x % y); //나머지
    //
    // // -3 = -1 * 3, +3 = 1 * 3
    // System.out.println("나이는 "+ 10 + "살 입니다.");

    // 자동형변환 (형의 승격)
    // int타입 보다 작은 타입을 연산하면 무조건 int타입 으로 바뀐다.
    // int타입 보다 작으면 결과는 int 타입으로 변환
    // int타입 보다 크면 큰 타입 기준으로 변환

    // byte b1 = 10;
    // byte b2 = 20;
    //
    // byte result = (byte)(b1 + b2);
    // System.out.println(result);
    //
    // int i = 100;
    // float f = 12.5f;
    //
    // float result2 = i + f;
    // System.out.println(result2);


    // 단항연산자
    // ++, -- (증감연산자) 값을 1씩 증가 or 감소
    // "변수"에만 적용이 가능
    // 전치, 후치

    // int a = 10;
    // a++; // 후치
    // ++a; // 전치
    // System.out.println(a);
    // a--;
    // --a;
    // System.out.println(a);
    //
    // int b = 10;
    // int c = 0;

    // c = ++b + 10; //전치
    // System.out.println("b = "+b+ " c = "+c ); // b = 11, c = 21

    // c = b++ + 10; //후치
    // System.out.println("b = "+b+ " c = "+c ); // b = 11, c = 20

    // int x = 2;
    // int result = x * x * x;
    //
    // System.out.println(result);
    //
    // int y = (x*x)-(3*x)+7;
    // System.out.println(y);

    // 비교연산자
    // <, >, <=, >=, ==, !=

    // int x = 10;
    // int y = 20;
    //
    // boolean result = x > y;
    // System.out.println(result);
    //
    // result = x == y;
    // System.out.println(result);
    //
    // result = x != y;
    // System.out.println(result);


    // 논리연산자
    // &&(and), ||(or), !(not)
    // 논리 값을 사용해서 연산한다. (두 가지 이상의 조건을 판단하고 싶을 때)

    // (true 또는 false) && (true 또는 false)
    // true && true == true
    // true && false == false
    // false && true == false
    // false && false == false


    // (true 또는 false) || (true 또는 false)
    // true || true == true
    // true || false == true
    // false || true == true
    // false || false == false


    // !true == false
    // !false == true

    // int x = 10;
    // int y = 20;
    // int z = 30;
    //
    // boolean result = x == 10 && y == 20 || z == 30;
    // System.out.println(result);
    //
    // result = x != 10 && y == 20;
    // System.out.println(result);
    //
    // result = x == 20 || y == 20;
    // System.out.println(result);
    //
    // result = x != 10 || y != 20;
    // System.out.println(result);
    //
    // boolean b = false;
    // b = !b;
    // System.out.println(b);

    // int x = 11;
    // boolean result = x >= 1 && x <= 10;
    // System.out.println(result);
    //
    // result = x < 1 || x > 10;
    // System.out.println(result);


    // 삼항연산자 (조건연산자)
    // 조건식(true or false) ? 결과1 : 결과2
    // int x = 10;
    // int y = 20;
    //
    // int result = x > y ? 22 : 33;
    // System.out.println(result);

    // int x = -5;
    //
    // int result = x > 0 ? x : -x;
    // System.out.println(result);


    // 대입연산자
    // 변수에 값을 할당하는 연산자 +
    // 우선순위가 가장 낮음
    // = (단순 대입 연산자)
    // +=, -=, *=, /=, .... (복합 대입 연산자)

    // int x;
    // x = 10;
    //
    // // +=
    // int y = 20;
    // y += 10 ; // y = y + 10
    // System.out.println(y);
    //
    // // -=
    // y -= 5; // y = y - 5
    // System.out.println(y);

    // int x = 10;
    // int y = 20;
    //
    // y += x + 30;
    // System.out.println(y);

    // int i_money = 65240;
    //
    // System.out.println("오만원권 " + i_money/50000 + "개");
    // i_money %= 50000; //i_money = i_money % 50000;
    // System.out.println("만원권 " + i_money/10000 + "개");
    // i_money %= 10000;
    // System.out.println("오천원권 " + i_money/5000 + "개");
    // i_money %= 5000;
    // System.out.println("천원권 " + i_money/1000 + "개");
    // i_money &= 1000;
    // System.out.println("오백원 " + i_money/500 + "개");
    // i_money &= 500;
    // System.out.println("백원 " + i_money/100 + "개");
    // i_money &= 100;
    // System.out.println("십원 " + i_money/500 + "개");


    // double d_eur = 1320.48026f;
    // double d_usd = 1063.82979f;
    //
    // double result = d_eur * 58 + d_usd * 32;
    // System.out.println((int) result + "원");
    // System.out.printf("%.2f원\n", result);
    //
    // result = (int) (result * 10) / 10.0;
    // System.out.println(result);
    //
    // // 바구니 하나는 10개의 사과를 담을수 있다.
    // // 그렇다면 바구니는 몇개가 필요 할까요?
    //
    // int apple = 134;
    // int basket;
    //
    // System.out.printf("바구니가 %d개 필요합니다.", basket = (apple / 10) + (apple % 10 > 0 ? 1 : 0));


    // double avg = 87.6754;
    // double result = (int) (avg * 10 + 0.5) / 10.0;
    // // 2.int형변환 - 1.더블형 - 3.더블형 -
    // System.out.println(result);

    double d = 3.1415;
    System.out.printf("%.2f", d);
    // %f는 최대 소수점 6자리까지 표기하고 그 이후나, 지정한 소수점자리 이후는 반올림 한다.
  }

}
