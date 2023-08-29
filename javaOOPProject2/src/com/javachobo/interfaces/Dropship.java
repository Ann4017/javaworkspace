package com.javachobo.interfaces;

public class Dropship extends Air_unit implements Repairable {

  Dropship() {
    super(125);
    i_hit_point = I_MAX_HP;
  }

}
