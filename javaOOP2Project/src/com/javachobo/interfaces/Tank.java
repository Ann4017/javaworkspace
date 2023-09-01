package com.javachobo.interfaces;

public class Tank extends Ground_unit implements Repairable {

  Tank() {
    super(150);
    i_hit_point = I_MAX_HP;
  }

}
