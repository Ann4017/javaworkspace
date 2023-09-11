package com.javachobo.synchronizeds;

import java.util.ArrayList;

public class Table {

  String[] dish_names = {"donut", "buger"};
  final int MAX_FOOD = 6;

  private ArrayList<String> dishes = new ArrayList<>();

  public synchronized void add(String _dish) { // remove() �� ���� arr�� ����ϸ� �����带 �̾�� ������ synchronized
                                               // �ϰ� ������Ѵ�.
    while (dishes.size() >= MAX_FOOD) {
      String name = Thread.currentThread().getName();
      System.out.println(name + " �� ���� is waiting");
      try {
        wait();
        Thread.sleep(20);
      } catch (InterruptedException e) {
        // TODO: handle exception
      }
    }

    dishes.add(_dish);
    notify();
    System.out.println(dishes.toString());

  }

  public void remove(String _dish_name) { // add() �� ���� arr�� ����ϸ� �����带 �̾�� ������ synchronized �ϰ�
                                          // ������Ѵ�.

    synchronized (this) {
      String name = Thread.currentThread().getName();

      while (dishes.size() == 0) {
        System.out.println(name + " ���ÿ� ������ ��� is waiting");

        try {
          wait();
          Thread.sleep(500);
        } catch (InterruptedException e) {
          // TODO: handle exception
        }

      }

      while (true) {

        for (int i = 0; i < dishes.size(); i++) {
          if (_dish_name.equals(dishes.get(i))) {
            dishes.remove(i);
            notify();
            return;
          }
        }

        try {
          System.out.println(name + " ���� �Դ� ������ ��� is wating");
          wait();
          Thread.sleep(500);
        } catch (InterruptedException e) {
          // TODO: handle exception
        }

      }

    }
  }


  public int dish_num() {
    return dish_names.length;
  }
}
