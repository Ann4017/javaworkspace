
public class SmartTv extends Tv {

  boolean internet;

  void display_internet() {
    if (internet) {
      System.out.println("���ͳ� ����");
    } else {
      System.out.println("���ͳ� ���� ����");
    }
  }

}
