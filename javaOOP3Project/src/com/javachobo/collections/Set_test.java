package com.javachobo.collections;

import java.util.HashSet;

public class Set_test { // �ӵ��� ������ ��������. �ߺ� ������� ����

  public static void main(String[] args) {

    HashSet set = new HashSet<>();
    //
    // set.add(1);
    // set.add("1");
    // set.add(2);
    // set.add("2");
    // set.add(3);
    // set.add(3);
    //
    // System.out.println(set); //����� Ȯ���غ��� ���� Ÿ���� �ߺ��� ������� ����


    // for (int i = 0; set.size() < 6; i++) { // size�� ���ϴ� ũ�����
    // int lotto = (int) (Math.random() * 45) + 1;
    // set.add(lotto);
    // }
    // System.out.println(set);

    int[][] board = new int[5][5];

    for (int i = 0; i <= board.length; i++) {
      for (int j = 0; j <= board[i][j]; j++) {
        set.add(board[i][j]);
      }
    }


  }


}
