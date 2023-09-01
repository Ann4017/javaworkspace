package com.javachobo.collections;

import java.util.HashSet;

public class Set_test { // 속도의 이점을 가져간다. 중복 허용하지 않음

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
    // System.out.println(set); //출력을 확인해보면 같은 타입의 중복을 허용하지 않음


    // for (int i = 0; set.size() < 6; i++) { // size가 원하는 크기까지
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
