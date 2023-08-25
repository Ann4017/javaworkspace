
public class Point {

  int x;
  int y;

  Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  String get_location() {
    return "x : " + x + ", y : " + y;
  }
}
