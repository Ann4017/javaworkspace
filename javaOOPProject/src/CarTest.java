
public class CarTest {

  public static void main(String[] args) {

    Car c = new Car(); // 생성자의 호출
    // 직접 초기화
    // c.color = "black";
    // c.gearType = "auto";
    // c.door = 4;
    System.out.printf("%s, %s, %d\n", c.color, c.gearType, c.door);

    Car c2 = new Car("red");
    System.out.printf("%s, %s, %d\n", c2.color, c2.gearType, c2.door);

    Car c3 = new Car("blue", "auto", 4);
    System.out.printf("%s, %s, %d\n", c3.color, c3.gearType, c3.door);
  }

}
