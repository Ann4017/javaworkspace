
public class CaptionTv extends Tv {
  // �θ��� ��Ҹ� �ް� �ڽ��� ������ �߰� ��Ҹ� �����Ѵ�.

  boolean caption;

  void display_caption(String txt) {
    if (caption) {
      System.out.println(txt);
    }
  }
}
