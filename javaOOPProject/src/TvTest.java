public class TvTest {

  public static void main(String[] args) {
    // ��ü ���� (�޸𸮿� ��(����, �޼ҵ�)�� �Ҵ�)
    // new Tv(); // ����, �ּҰ�


    // new Tv().color = "red"; // ���� �Ҵ� ������
    // System.out.println(new Tv().color); // ������ �ν��Ͻ��� �����ϱ� ������ �� ����� �ٸ���.


    Tv t; // ������ ���� (������ ����) class �̸��� Ÿ���� �ȴ�.
    t = new Tv();

    System.out.println(t.color);
    System.out.println(t.channel);
    System.out.println(t.power);

    t.color = "red";
    System.out.println(t.color);

    t.channel = 7;
    System.out.println(t.channel);

    t.channel_down();
    System.out.println(t.channel);


  }

}
