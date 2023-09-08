
public class Thread_ex10_test implements Runnable {
  // ���� �������� Ȱ�� (���� ������� ���� �����尡 ���� �Ǳ� �� ������ �۵��Ѵ�.
  static boolean auto_save = false;

  public static void main(String[] args) {

    Thread daemon = new Thread(new Thread_ex10_test());
    daemon.setDaemon(true); // ���� ������
    daemon.start();

    for (int i = 1; i < 10; i++) {
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      System.out.println(i);
      if (i == 5) {
        auto_save = true;
      }
    }
    System.out.println("����");

  }

  @Override
  public void run() {

    while (true) {
      try {
        Thread.sleep(3000);
        if (auto_save == true) {
          auto_save();
        }
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }

  }

  public void auto_save() {
    System.out.println("����");
  }
}
