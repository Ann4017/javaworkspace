
public class Car {

  // �Ӽ�
  String color;
  String gearType;
  int door;


  // ������
  // ��ü�� �����Ѵ�. ***
  // ��� ������ �ʱ�ȭ(�ν��Ͻ� ����) ***
  // �����ε��� �����ϴ�.
  // �����ε� �� �⺻ ������ ������ �Ұ��ϴ�.
  // Ŭ������ �̸��� �Ȱ��� �����.
  // ��ü�� ���� �� �� �� �ѹ� ȣ�� �ȴ�.
  // �⺻ ������ (�����ڰ� ���� �� ��������) Car(){}
  // ������ �� �� ȣ���� �����ϴ�. this()
  Car() {
    this("white", "����", 2);
  }

  Car(String color) { // ��������� �Ű������� �̸��� ���� ��� ����������� �����ϱ� ���� this. �� ����Ѵ�.
    this(color, "����", 2);
  }

  Car(String color, String gearType, int door) {
    this.color = color;
    this.gearType = gearType;
    this.door = door;
  }



  // ���


}
