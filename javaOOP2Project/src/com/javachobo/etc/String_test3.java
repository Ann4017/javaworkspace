package com.javachobo.etc;

public class String_test3 {

  public static void main(String[] args) {

    // StringBuffer, StringBuilder ����ȭ ��/�� �� ����

    StringBuffer sb = new StringBuffer(); // String �� �ٸ��� �ٷ� ���� �־� �� �� ����.
    System.out.println(sb);

    sb.append("123"); // �߰� �ϴ� �޼ҵ�
    System.out.println(sb);

    String str;
    str = sb.toString(); // StringBuffer �� String �� ���� �ٸ� Ÿ���̴�. // �������� ����ȯ�� �Ұ��ϴ�. (str =
                         // (String)sb;)
    // new String(toStringCache) �������̵� �� ���� ĳ������ ���ҷ� �����ǰ� �Ǿ���Ѵ�.

  }

}
