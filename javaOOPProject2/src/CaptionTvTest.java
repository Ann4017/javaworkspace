
public class CaptionTvTest {

  public static void main(String[] args) {

    CaptionTv t = new CaptionTv();
    t.channel = 7;
    t.channel_up();
    System.out.println(t.channel);

    t.caption = true;
    t.display_caption("�ڸ��ڸ��ڸ�");

    SmartTv s = new SmartTv();
    s.channel = 11;
    s.channel_down();
    System.out.println(s.channel);

    s.display_internet();
    s.internet = true;
    s.display_internet();
  }



}

