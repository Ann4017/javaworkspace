
public class Thread_ex15_test {

  public static void main(String[] args) {
    // 스레드의 제어

    Runnable r = new Runnable15();
    Thread th1 = new Thread(r, "*"); // 인자로 스레드의 이름을 넣어줄 수 있다.
    Thread th2 = new Thread(r, "**");
    Thread th3 = new Thread(r, "***");

    th1.start();
    th2.start();
    th3.start();

    try {
      Thread.sleep(3000);
      th1.suspend(); // 해당 스레드 일시정지
      Thread.sleep(2000);
      th2.suspend();
      Thread.sleep(3000);
      th1.resume(); // 일시정지 된 스레드 실행
      Thread.sleep(3000);
      th1.stop(); // 실행 중인 스레드 중지
      th2.stop(); // 일시중지 상태라면 실행 대기열로 간 후 스레드 중지 (중지 되기 전 스레드끼리 교착상태가 이루어질 수 있다.)
      Thread.sleep(2000);
      th3.stop();

    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    System.out.println("프로그램 종료");
  }

}
