
public class MethodOvering {
  // �����ε� (overloading)
  // 1. �޼ҵ��� �̸��� ���ƾ� �Ѵ�.
  // 2. �Ű������� ���� �Ǵ� Ÿ�� �߿� �ϳ��� ���Ƽ��� �ȵȴ�.
  // 3. return Ÿ���� �ٸ��ٰ� �ؼ� �����ε��� ������ ���� �ʴ´�.

  public static void main(String[] args) {
    System.out.println(); // �����ε��� ����) println(); int��, String��, .. ���
  }

  void add() {}

  void add(int x) {}

  // int add() {}

  void add(double x) {}

  void add(int x, int y) {}

  void add(int x, double y) {}

  void add(double x, int y) {}



}
