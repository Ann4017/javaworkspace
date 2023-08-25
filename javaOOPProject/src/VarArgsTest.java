
public class VarArgsTest {

  public static void main(String[] args) {
    // 가변인자
    // 메소드의 매개변수의 개수를 정하지 않고 사용하겠다.
    // 가변인자 메소드는 오버로딩을 허용하지 않는다.

    concate("a", "b", "c", "d", "e");
    concate(new String[] {"1", "2", "3", "4", "5"});
  }

  // 인자를 배열 뿐만 아니라 각각의 같은 타입을 받을 수 있으며 배열로 만들어준다.
  static void concate(String... args) { // String[] args 와 같다.
    for (int i = 0; i < args.length; i++) {
      System.out.print(args[i]);
    }
    System.out.println();
  }
}
