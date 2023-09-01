
public class SmartTv extends Tv {

  boolean internet;

  void display_internet() {
    if (internet) {
      System.out.println("인터넷 연결");
    } else {
      System.out.println("인터넷 연결 실패");
    }
  }

}
