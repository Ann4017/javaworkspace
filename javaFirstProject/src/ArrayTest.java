

public class ArrayTest {

  public static void main(String[] args) {
    // 배열
    // 동일의 타입의 데이터를 여러개를 하나의 변수로 관리하는 방법
    // 1차원 배열 : int [] 변수명
    // 다차원 배열 : int [][] 변수명
    // 배열은 데이터의 순차적인 처리 위해서 주로 사용한다.

    // int x, y, z;
    // x = 10;
    // y = 20;
    // z = 30;

    // int[] arr; // 배열변수 선언
    // arr = new int[5]; // 배열의 생성

    // int[] arr = new int[5]; //선언과 생성

    // int[] arr = {10,20,30,40,50} //선언, 생성, 초기화

    // arr[0] = 10; // 배열의 초기화
    // arr[1] = 20;
    // arr[2] = 30;
    // arr[3] = 40;
    // arr[4] = 50;
    //
    // System.out.println(arr[4]);


    // int[] arr = new int[5];

    // 배열의 활용
    // 반복문 for
    // 배열의 크기

    // for (int i = 0; i < arr.length; i++) {
    // arr[i] = i + 1;
    // }
    // for (int i = 0; i < arr.length; i++) {
    // System.out.println(arr[i]);
    // }
    //
    // int sum = 0;
    //
    // for (int i = 0; i < arr.length; i++) {
    // sum += arr[i];
    // }
    // System.out.println(sum);


    // int[] arr = new int[] {10, 20, 30}; // 메소드의 매개변수 값, 리턴값으로 사용할 때

    // char[] carr = new char[3];
    // carr[0] = 'a';
    // carr[1] = 'a';
    // carr[2] = 'a';
    // System.out.println(carr[2]);
    //
    // String[] strarr = new String[3];
    // strarr[0] = "abc";
    // strarr[1] = "bcd";
    // strarr[2] = "cdew";
    // System.out.println(strarr[1]);


    // 배열의 복사
    // 반복문을 이용한 방식
    // 함수를 이용하는 방식 arrycopy()

    // int[] arr1 = {1, 2, 3, 4, 5};
    // int[] arr2 = new int[5];
    //
    // System.out.println(Arrays.toString(arr1));
    // System.out.println(Arrays.toString(arr2));
    //
    // System.arraycopy(arr1, 3, arr2, 3, 2);
    // System.out.println(Arrays.toString(arr2));


    // int[] score = {23, 123, 5, 4, 100, 64, 65, 21};
    // int max = score[0];
    // int min = score[0];
    // for (int i = 0; i < score.length; i++) {
    // if (max < score[i]) {
    // max = score[i];
    // }
    // if (min > score[i]) {
    // min = score[i];
    // }
    // }
    // System.out.printf("min:%d\nmax:%d", min, max);


    // 배열의 값 섞기
    // int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
    // int x = 10;
    // int y = 20;
    // int temp;

    // temp = x;
    // x = y;
    // y = temp;

    // int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    // System.out.println(Arrays.toString(arr));
    //
    // for (int i = 0; i < arr.length * 10; i++) {
    // int index1 = (int) (Math.random() * 10);
    // int index2 = (int) (Math.random() * 10);
    // int temp;
    // temp = arr[index1];
    // arr[index1] = arr[index2];
    // arr[index2] = temp;
    // }
    //
    // System.out.println(Arrays.toString(arr));


    // 로도번호 생성기
    // int[] lotto = new int[6];
    // boolean ck;
    //
    // for (int i = 0; i < lotto.length; i++) {
    // while (true) {
    // lotto[i] = (int) (Math.random() * 45) + 1;
    // ck = false;
    //
    // for (int j = 0; j < i; j++) {
    // if (lotto[j] == lotto[i]) {
    // ck = true;
    // break;
    // }
    // }
    // if (!ck) {
    // break;
    // }
    // }
    // }
    // System.out.println(Arrays.toString(lotto));



    // 정렬
    // 오름차순, 내림차순
    // 선택 정렬
    // int[] arr = {7, 5, 9, 3, 6};
    // System.out.println(Arrays.toString(arr));
    //
    // // 정렬
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = i + 1; j < arr.length; j++) {
    // if (arr[i] > arr[j]) {
    // int tmp;
    // tmp = arr[i];
    // arr[i] = arr[j];
    // arr[j] = tmp;
    // }
    // }
    // }
    // System.out.println(Arrays.toString(arr));


    // 0 부터 9까지 의 숫자들이 몇개 씩 들어가는지 카운트
    int[] arr = {0, 1, 2, 2, 1, 4, 4, 4, 5, 7, 7, 9, 8};
    int[] result = new int[10]; // 자동 초기화 int는 기본 값으로 0 이 초기화 된다.

    for (int i = 0; i < arr.length; i++) {
      result[arr[i]]++; // 왜 이렇게 하는지 이해 요망
    }

    for (int i = 0; i < result.length; i++) {
      System.out.printf("%d 의 개수는 %d\n", i, result[i]);
    }


  }

}
