package com.javachobo.synchronizeds;

public class Coustomer implements Runnable {

  // �����忡 ���� �� �ν��Ͻ� ������ static �������� ��� �ȴ�.

  Account acc = new Account(); // ������ ������ Ŭ�������� ���� �ȴ�.

  @Override
  public void run() {
    while (acc.getBalance() > 0) {
      int money = (int) (Math.random() * 3 + 1) * 100;
      acc.with_draw(money);
      System.out.println("balance : " + acc.getBalance());
    }


  }

}
