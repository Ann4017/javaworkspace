
public class Tv {
  // �Ӽ�
  // �������
  // �ڵ��ʱ�ȭ

  // �⺻��
  // ���� : byte, short, int, long = 0
  // �Ǽ� : double = 0.0, float = 0.0f
  // ���� : boolean = false
  // ���� : char = ' '

  // ������
  // �ʱⰪ : null
  // String = null

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
