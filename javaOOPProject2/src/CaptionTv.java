
public class CaptionTv extends Tv {
  // 부모의 요소를 받고 자식은 별도의 추가 요소를 구성한다.

  boolean caption;

  void display_caption(String txt) {
    if (caption) {
      System.out.println(txt);
    }
  }
}
