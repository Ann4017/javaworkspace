

public class Thread_test {

  public static void main(String[] args) {

    // Thread
    // �����带 �����ϴ� �ΰ��� ���
    // Thread Ŭ����, Runnable �������̽�

    Thread_ex1 th1 = new Thread_ex1();

    Runnable r = new Thread_ex2(); // Runnable �� ��� �޴� Ŭ������ �Ʒ� �ڵ�ó�� ��������� �Ѵ�.
    Thread th2 = new Thread(r);

    th1.start(); // �������� ���� ���
    th2.start(); // ���� ���������� �۵��Ѵ�.
  }


}
