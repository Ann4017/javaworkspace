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

    // t.hour = 11; // ���� ��Ű���� �ƴϹǷ� ��������� default �� ��� �� �� ����.
    // t.min = 42;
    // t.sec = 55;
  }

}
