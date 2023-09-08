package com.javachobo.synchronizeds;

public class Account {

  private int balance = 1000;

  public int getBalance() {
    return balance;
  }

  public synchronized void with_draw(int _money) { // 메소드의 리턴타입 앞에 synchronized 스레드들의 동시적인 움직임을 순서대로
                                                   // 작동하게 해준다. (스레드 간의 동기화)
    if (balance >= _money) {
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      balance -= _money;
    }
  }



}
