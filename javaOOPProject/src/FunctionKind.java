
public class FunctionKind {

  // �Ӽ�

  // ���(�޼ҵ�)
  // �ν��Ͻ�
  // Ŭ���� (���� ���� ��밡��)
  // ���� ��/���� ������� ��밡��


  // void add() { // �ν��Ͻ�
  // System.out.println(3 + 5);
  //
  // }
  //
  // static void sub() { // Ŭ����(����ƽ)�޼ҵ�
  // System.out.println(6 - 2);
  //
  // }


  // Ŭ��������� �ν��Ͻ��� ����� ��������
  // Ŭ���� : ���� �� �޸� �Ҵ�
  // ����ƽ : ���� ���� �޸� �Ҵ�

  int iv;
  static int cv;

  void instanceMethod() {
    iv = 10;
    cv = 20; // �ν��Ͻ��ȿ����� ����ƽ�� ����� �����ϴ� ����ƽ�� ���� �޸𸮿� �Ҵ� �Ǳ� ������
  }

  void instanceMethod2() {
    instanceMethod();
    staticMethod();
  }

  static void staticMethod() {
    // iv = 20; ��� �Ұ�
    cv = 30;
  }

  static void staticMethod2() {
    // instanceMethod(); ��� �Ұ�
    staticMethod();
  }


}
