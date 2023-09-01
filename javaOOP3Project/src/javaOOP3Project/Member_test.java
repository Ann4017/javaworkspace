package javaOOP3Project;

public class Member_test {

  public static void main(String[] args) {

    Member m = Member.builder().id("ann").pwd("1234").ADDR("서울").hobby("sport").build(); // builder
                                                                                         // 사용으로
                                                                                         // 선택적
                                                                                         // 초기화

    System.out.println(m);

  }

}
