import com.javachobo.modifier.Time;

public class TimeTest {

  public static void main(String[] args) {

    Time t = new Time();
    // t.hour = 11;
    // t.min = 42;
    // t.sec = 55;

    t.setHour(11);
    int hour = t.getHour();
    System.out.println(hour);

    // t.hour = 11; // 같은 패키지가 아니므로 잡근제어자 default 로 사용 할 수 없다.
    // t.min = 42;
    // t.sec = 55;
  }

}
