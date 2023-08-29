package com.javachobo.interfaces;

public class Apt_buyer_test {

  public static void main(String[] args) {

    Apt1 a1 = new Apt1();
    Apt2 a2 = new Apt2();
    Apt3 a3 = new Apt3();
    Apt4 a4 = new Apt4();
    Apt_buyer user = new Apt_buyer();

    user.set_apt_info(a1);
    user.set_apt_info(a2);
    user.set_apt_info(a3);
    user.set_apt_info(a4);
    user.apt_info();

  }

}
