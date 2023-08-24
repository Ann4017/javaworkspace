
public class TvTest2 {

  public static void main(String[] args) {

    Tv t1 = new Tv();
    Tv t2 = new Tv();

    t1.channel = 7;
    System.out.println(t1.channel);

    System.out.println(t2.channel);

    // 타입이 동일한 참조형 변수는 서로 값을 주고 받을 수 있다.
    t2 = t1;
    System.out.println(t2.channel);

  }

}
