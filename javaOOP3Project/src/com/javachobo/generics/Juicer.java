package com.javachobo.generics;

public class Juicer {

  static Juice make_juicer(Fruit_box<? extends Fruit> box) {

    String tmp = "";
    for (Fruit f : box.get_list()) {
      tmp += f + "";
    }

    return new Juice(tmp);
  }

}
