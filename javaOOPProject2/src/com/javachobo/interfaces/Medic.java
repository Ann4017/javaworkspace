package com.javachobo.interfaces;

public class Medic extends Ground_unit implements Hillable {

  Medic() {
    super(75);
    i_hit_point = I_MAX_HP;
  }

  void hill(Hillable h) {

    if (h instanceof Unit) {
      Unit u = (Unit) h;

      while (u.i_hit_point != u.I_MAX_HP) {
        u.i_hit_point++;
      }

      System.out.println("치료 완료");
    }
  }
}
