package com.javachobo.collections;

public class Set_test { // 속도의 이점을 가져간다. 중복 허용하지 않음

  public static void main(String[] args) {

    // HashSet set = new HashSet();
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

    // int[][] board = new int[5][5];
    //
    // for (int i = 0; set.size() < 25; i++) { // Integer 형변환
    // set.add((int) (Math.random() * 50) + 1);
    // }
    //
    // ArrayList list = new ArrayList(set); // set 타입은 값을 랜덤으로 섞을 수 없기 때문에 list 타입으로 형변환 후
    // Collections.shuffle(list); // 셔플로 섞는다
    //
    // Iterator it = list.iterator();
    //
    // for (int i = 0; i < board.length; i++) {
    // for (int j = 0; i < board[i].length; j++) {
    // board[i][j] = (Integer) it.next();
    // System.out.println(board[i][j] + " ");
    // }
    // System.out.println();
    // } }
  }
}
