package com.javachobo.collections;

import java.util.TreeSet;

public class TreeSet_test {

  public static void main(String[] args) {

    TreeSet set = new TreeSet<>(); // �ڵ� ����

    // TreeSet
    // ������ ����ϴ� ��ü�� �ݵ�� ���İ� ���� �� �������̽��� ���� ���̵� �Ǿ��־�� �Ѵ�.
    // �����͸� ���� ���ش�.(��������)
    // ������ Ÿ��(������) �ȿ� ���Ŀ� ���� ���ǰ� �Ǿ��ִ�.
    // Integer�� ���� ������ �����ϰ� �ִ�.

    set.add(1); // == Integer(1) ����ڽ�
    set.add(2);
    set.add(5);
    set.add(3);
    set.add(4);

    System.out.println(set);

    for (Object obj : set) {
      int i = (Integer) obj;
      System.out.println(i);
    }

  }

}
