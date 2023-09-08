package com.javachobo.synchronizeds;

public class Coustomer implements Runnable {

  // 스레드에 정의 된 인스턴스 변수는 static 개념으로 사용 된다.

  Account acc = new Account(); // 변수는 스레드 클래스에서 공유 된다.

  @Override
  public void run() {
    while (acc.getBalance() > 0) {
      int money = (int) (Math.random() * 3 + 1) * 100;
      acc.with_draw(money);
      System.out.println("balance : " + acc.getBalance());
    }


  }

}
