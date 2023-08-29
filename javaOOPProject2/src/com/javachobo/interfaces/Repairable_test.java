package com.javachobo.interfaces;

public class Repairable_test {

  public static void main(String[] args) {

    Marine mr = new Marine();
    SCV s = new SCV();
    Tank t = new Tank();
    Dropship d = new Dropship();
    Medic md = new Medic();

    s.repair(t);
    s.repair(d);
    s.repair(s);
    md.hill(mr);
    md.hill(md);

  }


}
