package com.javachobo.synchronizeds;

public class Coustomer_test {

  public static void main(String[] args) {

    Runnable r = new Coustomer();
    new Thread(r).start();
    new Thread(r).start();



  }

}
