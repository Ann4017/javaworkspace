// import com.javachobo.circle.*;
import static java.lang.Math.random; // �̷������� ���� import �����ָ� "Math" �� ���� �� �� �ִ�.
import com.javachobo.circle.Circle;

public class CircleTest {

  public static void main(String[] args) {

    Circle c = new Circle(5.0);
    double area = c.get_area();
    System.out.println(area);

    System.out.println((int) (random() * 100) + 1);
  }

}
