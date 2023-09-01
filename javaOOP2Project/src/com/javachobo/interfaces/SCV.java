package com.javachobo.interfaces;

public class SCV extends Ground_unit implements Repairable {

  SCV() {
    super(50);
    i_hit_point = I_MAX_HP;
  }

  void repair(Repairable r) {
    if (r instanceof Unit) {
      Unit u = (Unit) r;

      while (u.i_hit_point != u.I_MAX_HP) {
        u.i_hit_point++;
      }

      System.out.println("수리 완료");
    }
  }

}
