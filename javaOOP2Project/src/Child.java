
public class Child extends Parent {

  int x = 20;

  void method() {

    System.out.println(x); // 10 // 20
    System.out.println(this.x); // 10 // 20
    System.out.println(super.x); // 10 // 10
  }
}
