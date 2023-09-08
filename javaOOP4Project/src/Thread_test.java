

public class Thread_test {

  public static void main(String[] args) {

    // Thread
    // 스레드를 정의하는 두가지 방법
    // Thread 클래스, Runnable 인터페이스

    Thread_ex1 th1 = new Thread_ex1();

    Runnable r = new Thread_ex2(); // Runnable 를 상속 받는 클래스는 아래 코드처럼 생성해줘야 한다.
    Thread th2 = new Thread(r);

    th1.start(); // 스레드의 실행 방식
    th2.start(); // 각각 독립적으로 작동한다.
  }


}
