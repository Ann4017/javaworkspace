
public class Tv {
  // �Ӽ�

  String color;
  boolean power;
  int channel;

  // ���

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
