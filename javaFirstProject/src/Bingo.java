

public class Bingo {

  public static void main(String[] args) {
    // // 변수 : int x = 10;
    // // 상수 : final int MAX = 10; 상수명은 항상 대문자
    //
    // final int SIZE = 5;
    // int row, col;
    // int num = 0;
    // boolean find = false;
    // Scanner sc = new Scanner(System.in);
    //
    // int[][] bingo = new int[SIZE][SIZE];
    //
    // for (int i = 0; i < SIZE; i++) {
    // for (int j = 0; j < SIZE; j++) {
    // bingo[i][j] = i * SIZE + j + 1;
    //
    // }
    // }
    // // System.out.println(Arrays.deepToString(bingo));
    //
    // for (int i = 0; i < SIZE; i++) {
    // for (int j = 0; j < SIZE; j++) {
    // row = (int) (Math.random() * SIZE);
    // col = (int) (Math.random() * SIZE);
    //
    // int tmp = bingo[i][j];
    // bingo[i][j] = bingo[row][col];
    // bingo[row][col] = tmp;
    // }
    // }
    // // System.out.println(Arrays.deepToString(bingo));
    //
    //
    // do {
    //
    // for (int i = 0; i < SIZE; i++) {
    // for (int j = 0; j < SIZE; j++) {
    // System.out.printf("%2d ", bingo[i][j]);
    // }
    // System.out.println();
    // }
    // System.out.println();
    // System.out.println("1~25의 숫자를 입력하세요. (종료 : 0 )");
    // num = sc.nextInt();
    //
    // for (int i = 0; i < SIZE; i++) {
    // for (int j = 0; j < SIZE; j++) {
    // if (bingo[i][j] == num) {
    // bingo[i][j] = 0;
    // find = true;
    // break;
    // }
    // }
    // if (find == true) {
    // break;
    // }
    // }
    // } while (num != 0);



    char[][] star = {{'*', '*', ' ', ' ', ' '}, {'*', '*', ' ', ' ', ' '},
        {'*', '*', '*', '*', '*'}, {'*', '*', '*', '*', '*'}};
    char[][] result = new char[star[0].length][star.length];

    for (int i = 0; i < star.length; i++) {
      for (int j = 0; j < star[i].length; j++) {
        System.out.print(star[i][j]);
      }
      System.out.println();
    }

    System.out.println();

    for (int i = 0; i < star.length; i++) {
      for (int j = 0; j < star[i].length; j++) {
        int x = j;
        int y = 4 - 1 - i;
        result[x][y] = star[i][j];
      }
    }

    for (int i = 0; i < result.length; i++) {
      for (int j = 0; j < result[i].length; j++) {
        System.out.print(result[i][j]);
      }
      System.out.println();
    }

    System.out.println();

    for (int i = 0; i < result.length; i++) {
      for (int j = 0; j < result[i].length; j++) {
        int x = j;
        int y = 5 - 1 - i;
        star[x][y] = result[i][j];
      }
    }

    for (int i = 0; i < star.length; i++) {
      for (int j = 0; j < star[i].length; j++) {
        System.out.print(star[i][j]);
      }
      System.out.println();
    }

    System.out.println();

    for (int i = 0; i < star.length; i++) {
      for (int j = 0; j < star[i].length; j++) {
        int x = j;
        int y = 4 - 1 - i;
        result[x][y] = star[i][j];
      }
    }

    for (int i = 0; i < result.length; i++) {
      for (int j = 0; j < result[i].length; j++) {
        System.out.print(result[i][j]);
      }
      System.out.println();
    }


  }
}
