
public class Tv {
  // ��ӿ����� �θ� Ŭ���� ����
  // �ΰ� �̻��� �ڽ� Ŭ������ �������� ����ϴ� ��Ҹ� �����ؼ� ������.
  // ���� ���
  // oop : ��ü������ ��ǥ : �ڵ��� �ּ�ȭ, ���� ����
  // ��� Ŭ������ Object ��� ���� Ŭ������ ��� �޴´�.


  String color;
  boolean power;
  int channel;


  void channel_up() {
    channel++;
  }

  void channel_down() {
    channel--;
  }

  void power() {
    power = !power;
  }


}

