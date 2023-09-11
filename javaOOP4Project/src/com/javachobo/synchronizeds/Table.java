package com.javachobo.synchronizeds;

import java.util.ArrayList;

public class Table {

  String[] dish_names = {"donut", "buger"};
  final int MAX_FOOD = 6;

  private ArrayList<String> dishes = new ArrayList<>();

  public synchronized void add(String _dish) { // remove() 와 같은 arr를 사용하며 스레드를 이어가기 때문에 synchronized
                                               // 하게 해줘야한다.
    while (dishes.size() >= MAX_FOOD) {
      String name = Thread.currentThread().getName();
      System.out.println(name + " 다 만들어서 is waiting");
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

  public void remove(String _dish_name) { // add() 와 같은 arr를 사용하며 스레드를 이어가기 때문에 synchronized 하게
                                          // 해줘야한다.

    synchronized (this) {
      String name = Thread.currentThread().getName();

      while (dishes.size() == 0) {
        System.out.println(name + " 접시에 음식이 없어서 is waiting");

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
          System.out.println(name + " 내가 먹는 음식이 없어서 is wating");
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
