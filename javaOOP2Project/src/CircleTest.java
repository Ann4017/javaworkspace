// import com.javachobo.circle.*;
import static java.lang.Math.random; // 이런식으로 굳이 import 시켜주면 "Math" 를 생략 할 수 있다.
import com.javachobo.circle.Circle;

public class CircleTest {

  public static void main(String[] args) {

    Circle c = new Circle(5.0);
    double area = c.get_area();
    System.out.println(area);

    System.out.println((int) (random() * 100) + 1);
  }

}
