package com.javachobo.synchronizeds;

public class Account {

  private int balance = 1000;

  public int getBalance() {
    return balance;
  }

  public synchronized void with_draw(int _money) { // �޼ҵ��� ����Ÿ�� �տ� synchronized ��������� �������� �������� �������
                                                   // �۵��ϰ� ���ش�. (������ ���� ����ȭ)
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
