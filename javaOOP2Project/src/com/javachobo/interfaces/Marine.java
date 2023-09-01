package com.javachobo.interfaces;

public class Marine extends Ground_unit implements Hillable {


  Marine() {
    super(40);
    i_hit_point = I_MAX_HP;
  }

}
