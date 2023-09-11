package com.javachobo.synchronizeds;

public class Customer implements Runnable {

  private Table table;
  private String food;



  public Customer(Table table, String food) {
    super();
    this.table = table;
    this.food = food;
  }

  @Override
  public void run() {

    while (true) {

      String name = Thread.currentThread().getName();

      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {

      }

      table.remove(food);
      System.out.println(name + " ate a " + food);

      // if (eat_food()) {
      // System.out.println(name + " eat a " + food);
      // } else {
      // System.out.println(name + " failed to eat " + food);
      //
      // }
    }

  }

  // boolean eat_food() {
  // return table.remove(food);
  // }

}
