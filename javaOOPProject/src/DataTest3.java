
public class DataTest3 {

  public static void main(String[] args) {

    Data d = new Data();
    d.x = 10;

    System.out.println("ȣ�� �� : " + d.x);

    Data d2 = copy(d);

    System.out.println("ȣ�� �� d : " + d.x);
    System.out.println("ȣ�� �� d2 : " + d2.x);


  }

  static Data copy(Data d) {

    System.out.println("copy() : " + d.x);

    Data tmp = new Data();
    tmp.x = 100;

    System.out.println("tmp.x : " + tmp.x);

    d.x = tmp.x;

    return tmp;

  }

}
