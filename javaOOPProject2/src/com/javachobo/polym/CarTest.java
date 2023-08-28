package com.javachobo.polym;

public class CarTest {

  public static void main(String[] args) {

    // Car car = null;
    //
    // FireEngine fe = new FireEngine();
    // FireEngine fe2 = null;
    //
    // fe.water();
    // car = fe; // 상속 관계를 전제 하에 값을 주고 받을 수 있다. (다형성 멤버의 사용 개수가 바뀐다.)
    // // car.water(); // 부모의 멤버는 4개 자식의 멤버는 1개 마지막 타입은 부모인 car 이므로 자식 멤버는 날라간다.
    // fe2 = (FireEngine) car; // 부모가 자식의 값으로 대입 될 때는 강제 형변환이 필요하다.
    // fe2.water(); // fe2의 멤버는 상속 관계까지 5개로 모두 사용가능

    FireEngine fe = new FireEngine();
    Ambulance ab = new Ambulance();

    do_work(fe);
    do_work(ab);

  }

  static void do_work(Car c) { // 매개변수를 부모클래스로 정의 (매개변수의 다형성, 자식을 받기 위한)
    if (c instanceof FireEngine) { // 다형성에서 타입을 체크하는 용도로 instanceof 를 사용한다.
      FireEngine fe = (FireEngine) c;
      fe.water();
    } else if (c instanceof Ambulance) {
      Ambulance ab = (Ambulance) c;
      ab.siren();
    }
  }
}
