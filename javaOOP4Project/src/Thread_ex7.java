
public class Thread_ex7 extends Thread {

  @Override
  public void run() {
    for (int i = 10; i > 0; i--) {
      System.out.println(i);

      try {
        Thread.sleep(1000);;
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }


  }
}
