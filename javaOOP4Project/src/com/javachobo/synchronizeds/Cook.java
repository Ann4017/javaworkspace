package com.javachobo.synchronizeds;

public class Cook implements Runnable {

  private Table table;

  public Cook(Table table) {
    super();
    this.table = table;
  }

  @Override
  public void run() {

    while (true) {
      int idx = (int) (Math.random() * table.dish_num());
      table.add(table.dish_names[idx]);

      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {

      }

    }

  }

}
