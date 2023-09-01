package com.javachobo.polym;

public class CarTest {

  public static void main(String[] args) {

    // Car car = null;
    //
    // FireEngine fe = new FireEngine();
    // FireEngine fe2 = null;
    //
    // fe.water();
    // car = fe; // ��� ���踦 ���� �Ͽ� ���� �ְ� ���� �� �ִ�. (������ ����� ��� ������ �ٲ��.)
    // // car.water(); // �θ��� ����� 4�� �ڽ��� ����� 1�� ������ Ÿ���� �θ��� car �̹Ƿ� �ڽ� ����� ���󰣴�.
    // fe2 = (FireEngine) car; // �θ� �ڽ��� ������ ���� �� ���� ���� ����ȯ�� �ʿ��ϴ�.
    // fe2.water(); // fe2�� ����� ��� ������� 5���� ��� ��밡��

    FireEngine fe = new FireEngine();
    Ambulance ab = new Ambulance();

    do_work(fe);
    do_work(ab);

  }

  static void do_work(Car c) { // �Ű������� �θ�Ŭ������ ���� (�Ű������� ������, �ڽ��� �ޱ� ����)
    if (c instanceof FireEngine) { // ���������� Ÿ���� üũ�ϴ� �뵵�� instanceof �� ����Ѵ�.
      FireEngine fe = (FireEngine) c;
      fe.water();
    } else if (c instanceof Ambulance) {
      Ambulance ab = (Ambulance) c;
      ab.siren();
    }
  }
}
