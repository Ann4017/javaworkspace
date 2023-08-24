public class TvTest {

  public static void main(String[] args) {
    // 객체 생성 (메모리에 값(변수, 메소드)을 할당)
    // new Tv(); // 생성, 주소값


    // new Tv().color = "red"; // 값을 할당 하지만
    // System.out.println(new Tv().color); // 각각의 인스턴스에 저장하기 때문에 윗 문장과 다르다.


    Tv t; // 변수의 선언 (참조형 변수) class 이름이 타입이 된다.
    t = new Tv();

    System.out.println(t.color);
    System.out.println(t.channel);
    System.out.println(t.power);

    t.color = "red";
    System.out.println(t.color);

    t.channel = 7;
    System.out.println(t.channel);

    t.channel_down();
    System.out.println(t.channel);


  }

}
