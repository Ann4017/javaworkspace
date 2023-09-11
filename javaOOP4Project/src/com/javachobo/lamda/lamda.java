package com.javachobo.lamda;

import java.util.ArrayList;
import java.util.Arrays;

public class lamda {

  // int max(int x, int y) {
  // return x > y ? x : y;
  // }

  // �̸��� ���� �޼ҵ� (lamda)
  // (int x, int y) -> {return x > y ? x : y} return �� ��� ���� ���� �߰�ȣ�� ������� �Ѵ�.
  //
  // (int x, int y) -> x > y ? x : y
  //
  // x, y -> x > y ? x : y
  //
  // x -> x * x // �Ű������� 1���� ��쿡 ������ ��

  // �̸����� �Լ��� ����ϱ� ����
  // �Լ��� �������̽��� �ʿ��ϴ�. (���ٽ��� ����ϱ� ���� ���� �������̽�)
  // �߻�޼ҵ�� �ݵ�� �ϳ��� �ۼ��Ѵ�.
  // @FunctionalInterface �ϳ��� �ۼ� �� �� �ְ� ������ �Ѵ�.

  // �͸� Ŭ����
  // new Object () {
  // int max(int x, int y) {
  // return x > y ? x : y;
  // }
  // }

  // Ÿ�� f = (int x, int y) -> x > y ? x : y
  // int max = f.max(10, 20);

  @FunctionalInterface
  interface my_func {
    int max(int x, int y);
  }


  my_func f = (int x, int y) -> x > y ? x : y;
  int max = f.max(10, 20);

  //
  ArrayList<String> list = (ArrayList<String>) Arrays.asList("aaa", "bbb");

}
