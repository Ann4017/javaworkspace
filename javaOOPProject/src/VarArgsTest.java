
public class VarArgsTest {

  public static void main(String[] args) {
    // ��������
    // �޼ҵ��� �Ű������� ������ ������ �ʰ� ����ϰڴ�.
    // �������� �޼ҵ�� �����ε��� ������� �ʴ´�.

    concate("a", "b", "c", "d", "e");
    concate(new String[] {"1", "2", "3", "4", "5"});
  }

  // ���ڸ� �迭 �Ӹ� �ƴ϶� ������ ���� Ÿ���� ���� �� ������ �迭�� ������ش�.
  static void concate(String... args) { // String[] args �� ����.
    for (int i = 0; i < args.length; i++) {
      System.out.print(args[i]);
    }
    System.out.println();
  }
}
