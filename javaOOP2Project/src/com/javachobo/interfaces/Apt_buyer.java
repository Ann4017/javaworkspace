package com.javachobo.interfaces;

public class Apt_buyer {

  // Apt1 a1 = new Apt1();
  // Apt2 a1 = new Apt2();
  // Apt3 a1 = new Apt3();

  Info_able apt_info;

  void set_apt_info(Info_able apt_info) {
    this.apt_info = apt_info;
  }

  void apt_info() {
    apt_info.price();
    apt_info.size();
  }

}
