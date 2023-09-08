
public class Thread_ex10_test implements Runnable {
  // 데몬 스레드의 활용 (데몬 스레드란 메인 스레드가 종료 되기 전 까지만 작동한다.
  static boolean auto_save = false;

  public static void main(String[] args) {

    Thread daemon = new Thread(new Thread_ex10_test());
    daemon.setDaemon(true); // 데몬 스레드
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
    System.out.println("종료");

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
    System.out.println("저장");
  }
}
