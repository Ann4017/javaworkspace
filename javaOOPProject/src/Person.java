
public class Person {

  // class를 표현 하는 기본 요소

  // 속성 (변수) : 예) 눈, 코, 입 , 이름, 나이, 성별, 피부색, 성격, .... 모든 정보
  String name;
  int age;
  String gender;
  String address;
  int legs;

  // 기능 (메소드) : 오감, 보기, 듣기, 나의 소개, ....등등

  void run() {
    System.out.println("대충 두다리를 이용해 걷기");
  }

  void show_my_info() {
    System.out.println(name);
    System.out.println(age);
  }

}
