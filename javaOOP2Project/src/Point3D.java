
public class Point3D extends Point {

  int z;

  Point3D(int x, int y, int z) {
    super(x, y);
    // this.x = x;
    // this.y = y;
    this.z = z;
  }

  // Point3D() { //�θ������ ȣ��
  // super();
  // }

  // ���ٶ��̵�(������)
  // ��Ӱ��迡�� �θ� �޼ҵ带 �ڽ��� ������
  // �θ�� �Ȱ��� �����.
  // ��ȯ Ÿ�Ա��� ���� �ؾ��Ѵ�.

  String get_location() {
    return "x : " + x + ", y : " + y + z;
  }

}
