package javaOOP3Project;

public class Member_test {

  public static void main(String[] args) {

    Member m = Member.builder().id("ann").pwd("1234").ADDR("����").hobby("sport").build(); // builder
                                                                                         // �������
                                                                                         // ������
                                                                                         // �ʱ�ȭ

    System.out.println(m);

  }

}
