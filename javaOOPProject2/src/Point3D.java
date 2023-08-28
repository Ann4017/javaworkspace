
public class Point3D extends Point {

  int z;

  Point3D(int x, int y, int z) {
    super(x, y);
    // this.x = x;
    // this.y = y;
    this.z = z;
  }

  // Point3D() { //부모생성자 호출
  // super();
  // }

  // 오바라이딩(재정의)
  // 상속관계에서 부모 메소드를 자식이 재정의
  // 부모와 똑같이 생겼다.
  // 반환 타입까지 동일 해야한다.

  String get_location() {
    return "x : " + x + ", y : " + y + z;
  }

}
