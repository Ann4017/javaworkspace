
public class FactorTest {

  public static void main(String[] args) {

    // int fac = 1;
    // for (int i = 1; i <= 5; i++) {
    // fac *= i;
    // }
    // System.out.println(fac);


    int fac = fac(5);
    System.out.println(fac);
  }

  // ���ȣ��
  // ���ѹݺ�
  // �Ű������� ������� ����
  // ���ǹ� ���
  // return�� ���

  static int fac(int n) {
    int result = 0;

    if (n == 1) {
      return 1;
    } else {
      result = n * fac(n - 1);
    }
    return result;
  }

}
