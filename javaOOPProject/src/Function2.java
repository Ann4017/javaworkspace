
public class Function2 {

  // 스택형 실행방식 1-2-3-2-1
  void mathod1() { // 메소드가 호출되고 있는 위치 찾지 Ctrl + Alt + h
    System.out.println("mathod1");
    mathod2();
    System.out.println("mathod1");
  }

  void mathod2() {
    System.out.println("mathod2");
    mathod3();
    System.out.println("mathod2");
  }

  void mathod3() {
    System.out.println("mathod3");
  }

}
