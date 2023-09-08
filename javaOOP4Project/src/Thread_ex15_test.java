
public class Thread_ex15_test {

  public static void main(String[] args) {
    // �������� ����

    Runnable r = new Runnable15();
    Thread th1 = new Thread(r, "*"); // ���ڷ� �������� �̸��� �־��� �� �ִ�.
    Thread th2 = new Thread(r, "**");
    Thread th3 = new Thread(r, "***");

    th1.start();
    th2.start();
    th3.start();

    try {
      Thread.sleep(3000);
      th1.suspend(); // �ش� ������ �Ͻ�����
      Thread.sleep(2000);
      th2.suspend();
      Thread.sleep(3000);
      th1.resume(); // �Ͻ����� �� ������ ����
      Thread.sleep(3000);
      th1.stop(); // ���� ���� ������ ����
      th2.stop(); // �Ͻ����� ���¶�� ���� ��⿭�� �� �� ������ ���� (���� �Ǳ� �� �����峢�� �������°� �̷���� �� �ִ�.)
      Thread.sleep(2000);
      th3.stop();

    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    System.out.println("���α׷� ����");
  }

}
