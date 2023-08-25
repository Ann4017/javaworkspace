
public class Circle extends ShapDraw {

  Point center; // 포함관계
  int r;

  Circle(Point center, int r) {
    this.center = center;
    this.r = r;
  }

  // void draw() {
  // System.out.printf("중점이 %d, %d 반지름이 %d 인 원을 그립니다.", center.x, center.y, r);
  // }
}
