

public class ArrayTest2 {

  public static void main(String[] args) {
    // 2차원 배열
    // 행, 열의 구조를 가진다.
    // index의 범위를 벗어나서는 안된다.

    // int[][] arr; // 2차원 배열의 선언
    // arr = new int[5][3]; // 배열의 생성
    // int[][] arr = new int[5][3]; // 선언, 생성
    // arr[0][0] = 1; // 배열의 초기화
    // arr[4][2] = 15;
    //
    // System.out.println(arr[4][2]);
    // System.out.println(arr[0][0]);


    // 선언, 생성, 초기화
    // int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}, {13, 14, 15}};
    //
    // System.out.println(arr[4][2]);
    // System.out.println(arr[0][0]);


    // 배열의 활용
    // 2차원 배열의 len(크기)
    // 행 : arr.length
    // 열 : arr[0].length

    // int[][] arr = new int[5][3];
    // int i_num = 0;
    //
    // for (int i = 0; i < arr.length; i++) { // 행
    // for (int j = 0; j < arr[i].length; j++) { // 열
    // arr[i][j] = i_num++;
    // }
    // }
    //
    // for (int i = 0; i < arr.length; i++) { // 행
    // for (int j = 0; j < arr[i].length; j++) { // 열
    // System.out.print(arr[i][j] + " ");
    // }
    // System.out.println();
    // }

    // 배열 변수는 주소값을 가진다. (포인터)

    // int[]arr = new int[5];
    //
    // int[]arrcopy = arr;


    // // 2차원 배열
    // int[][]arr = new int[2][2];
    // //arr : 시작 주소값 = arr[0] (첫번째 행의 위치)
    // //arr[] : 행의 주소값
    // //arr[][] : 값의 주소
    // int [][]arrcopy = arr;
    //
    //

    // int[][] arr = new int[2][5];
    // int num = 0;
    //
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = 0; j < arr[i].length; j++) {
    // // arr[i][j] = num++;
    // arr[i][j] = (i * 5) + j + 1;
    // }
    // }
    // System.out.println(Arrays.deepToString(arr));
    //
    //
    // int sum = 0;
    //
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = 0; j < arr[i].length; j++) {
    // sum += arr[i][j];
    // }
    // }
    // System.out.println(sum);



    // 학생별 총점, 평균, 과목별 총점
    int[][] score = {{90, 90, 90}, {20, 20, 20}, {30, 30, 30}, {40, 40, 40}, {50, 50, 50}};

    int math_total = 0;
    int eng_total = 0;
    int kor_total = 0;

    System.out.println("번호  국어  영어  수학  총점  평균");
    System.out.println("------------------------");
    for (int i = 0; i < score.length; i++) {

      System.out.print(i + 1 + "   ");
      int sum = 0;
      double avg = 0.0;

      kor_total += score[i][0];
      eng_total += score[i][1];
      math_total += score[i][2];

      for (int j = 0; j < score[i].length; j++) {
        sum += score[i][j];
        System.out.print(score[i][j] + "  "); // 국영수
      }
      avg = sum / (double) score[i].length;
      System.out.println(sum + "  " + avg); // 총점, 평균
    }
    System.out.println("------------------------");
    System.out.printf("총점  %d %d %d\n", kor_total, eng_total, math_total);



  }

}
