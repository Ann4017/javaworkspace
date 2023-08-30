package com.javachobo.etc;

public class String_test {

  public static void main(String[] args) {

    // String str = "a";
    // String str2 = new String("a");

    String str = "abcd";
    // abcd ���� ���ڿ����� 0123 ���� �ε��� ��ȣ�� �ٴ´�.

    char c = str.charAt(3); // ���ڿ����� �ϳ��� ���ڸ� ������ �� ������ ��ȯ ���� char �̴�.
    System.out.println(c);

    int idx = str.indexOf('d'); // �ݴ�� ���ڿ��� ���� ������ �ε��� ��ȣ�� �������� ��� �̴� (��ȯ int).
    int idx2 = str.indexOf(c);
    System.out.println(idx);
    System.out.println(idx2);

    int len = str.length(); // ��ü ���ڿ��� ���̸� Ȯ�� �ϴ� ���
    System.out.println(len);

    String re = str.replace('c', 'C'); // ������ ���ڿ����� ���ڸ� ��ü�ϴ� ���
    System.out.println(re);

    String animals = "dog, cat, bear"; // ���ڿ� �ȿ��� ���� �� ���ڿ��� �������� ����� �迭�� ����� ���
    String[] ani = animals.split(", ");

    for (String s : ani) { // ��� �� for ��; for(�迭�� ���� �־��� Ÿ�԰� ���� : �ݺ� �� �迭)
      System.out.println(s);
    }

    // boolean b = str.startsWith("dog"); // ���ڿ��� �����ϴ� ���ڿ��� Ȯ�� (��ȯ ���� boolean �̴�)
    if (animals.startsWith("dog")) { // �ݴ�� animals.endsWith()
      System.out.println("dog �� �����ϴ� ���ڿ�");
    } else {
      System.out.println("dog �� �������� �ʴ� ���ڿ�");
    }

    // substring(���� �ε���, ������ �ε���+1) ���ڿ� �� ���� ������ ���ڿ��� �������� ���
    String str2 = "java.chobo.com";
    System.out.println(str2.substring(5, 10));
    String s = str2.substring(5, 10);
    System.out.println(s);

    int i = 100;
    String iv = String.valueOf(i); // �⺻���� ���ڿ��� �ٲ��ִ� ��� // i + "" �� ����� ����
    System.out.println(iv);

    String s1 = "hello";
    System.out.println(s1);
    System.out.println(s1.toString()); // toString �� �������̵� �Ǹ� �ڵ� ���� �Ǿ��� ������ �ּҰ��� �ƴ� ���� ��� �ȴ�.

    String ss1 = "hello";
    String ss2 = "hello";
    if (ss1.equals(ss2)) { // ���ڿ� �񱳴� == ��ȣ �񱳰� �Ұ����ϰ� equals()�� ����ؾ� �Ѵ�.
      System.out.println("����");
    } else {
      System.out.println("�ٸ���");
    }
  }

}
