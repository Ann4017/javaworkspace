
public class DataTest2 {

  public static void main(String[] args) {

    Data d = new Data();
    d.x = 10;
    System.out.println("호출 전 " + d.x);

    change(d);
    System.out.println("호출 후 " + d.x);

  }

  static void change(Data d) {

    d.x = 1000;
    System.out.println("change : " + d.x);
  }

  void change2(int x) {

    x = 1000;
    System.out.println("change : " + x);
  }
}
