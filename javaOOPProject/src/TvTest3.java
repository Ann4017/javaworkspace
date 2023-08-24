
public class TvTest3 {

  public static void main(String[] args) {

    // 객체 배열

    // int x, y, z;
    // x = 10;
    // y = 20;
    // z = 30;
    //
    // int[] arr = new int[3];
    // arr[0] = 10;
    // arr[1] = 20;
    // arr[2] = 30;
    //
    //
    // Tv t1, t2, t3;
    // t1 = new Tv();
    // t2 = new Tv();
    // t3 = new Tv();

    // Tv[] tvarr = new Tv[3]; // 배열의 선언, 생성 (객체x)
    // tvarr[0] = new Tv(); // 객체의 초기화
    // tvarr[1] = new Tv();
    // tvarr[2] = new Tv();
    //
    // tvarr[0].channel = 10;
    // tvarr[1].channel = 20;
    // tvarr[2].channel = 30;
    //
    // System.out.println(tvarr[0].channel);
    // System.out.println(tvarr[1].channel);
    // System.out.println(tvarr[2].channel);

    Tv[] tvarr = new Tv[3];

    for (int i = 0; i < tvarr.length; i++) {
      tvarr[i] = new Tv();
    }
    for (int i = 0; i < tvarr.length; i++) {
      tvarr[i].channel = (i + 1) * 10;
      System.out.println(tvarr[i].channel);
    }



  }

}
