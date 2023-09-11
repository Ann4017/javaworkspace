package com.javachobo.synchronizeds;

public class Thread_wait_test2 {

  public static void main(String[] args) throws InterruptedException {

    Table table = new Table();
    new Thread(new Cook(table), "Cook1").start();
    new Thread(new Customer(table, "donut"), "CUST1").start();
    new Thread(new Customer(table, "buger"), "CUST2").start();

    Thread.sleep(5000);
    System.exit(0); // 슬립 이후 강제 종료

  }

}
