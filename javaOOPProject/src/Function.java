import java.util.Arrays;

public class Function {

  // �Ӽ�

  // ��� (�޼ҵ�)

  // ����Ÿ�� �޼ҵ��̸�([�Ű�����...]) {
  // ���๮
  // [return ���� ��]
  // }


  // ��)
  // ����Ÿ�� : void, �⺻��Ÿ��(8����), ������
  // �޼ҵ� �̸� : �۸�
  // �Ű����� : ���� (int x)
  // ���๮ : System.out.println();
  // return : ���� �� => x + y ...

  void add() { // �޼ҵ� ����
    System.out.println(3 + 4);
  }

  void add2(int x, int y) {
    System.out.println(x + y);
  }

  int add3(int x, int y) {
    int sum = x + y;
    return sum;
  }

  int sub(int x, int y) {
    int sum = x - y;
    return sum;
  }

  int mul(int x, int y) {
    int sum = x * y;
    return sum;
  }

  double div(int x, int y) {
    double sum = x / (double) y;
    return sum;
  }


  // return
  // �޼ҵ��� �������
  // ����Ÿ�� void�� ���

  void func(int x) {
    if (x < 10) {
      System.out.println("fail");
      return; // ���ǿ� ������ ��� ����
    }
    System.out.println("funk");
  }

  int func1(int x, int y) {
    // if (x > y) {
    // return x;
    // } else {
    // return y;
    // }

    if (x > y) {
      return x;
    }
    return y;
  }

  // �Ű������� ��ȿ�� �˻�

  float div2(int x, int y) {
    // ������ �� �� ������ 0���� ������ �ȵȴ�.
    // 23 / 0 (error)

    if (y == 0) {
      return 0;
    }
    return x / (float) y;
  }


  void defultArg(int x, int y) {
    x = 100;
    y = 200;
    System.out.println(x + " ," + y);
  }

  void refArg(int[] arr) {
    arr[0] = 100;
    System.out.println("refArg���� ���");
    System.out.println(Arrays.toString(arr));
  }

}
