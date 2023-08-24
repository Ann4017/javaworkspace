
public class CardTest {

  public static void main(String[] args) {

    // Card.cv = 30;
    //
    // System.out.println(Card.cv);
    //
    //
    // Card c = new Card();
    // c.iv = 20;
    // c.cv = 10;
    //
    // System.out.println(c.iv);
    // System.out.println(c.cv);


    // Card c1 = new Card();
    // Card c2 = new Card();
    //
    // c1.iv = 10;
    // c2.iv = 20;
    //
    // System.out.println(c1.iv);
    // System.out.println(c2.iv);
    //
    // Card.cv = 30;
    // System.out.println(Card.cv);
    // Card.cv = 40;
    // System.out.println(Card.cv);
    //
    // c1.cv = 50;
    // System.out.println(c1.cv);
    // System.out.println(c2.cv);


    Card c1 = new Card();
    Card c2 = new Card();

    c1.s_kind = "spade";
    c1.i_num = 1;

    c2.s_kind = "dia";
    c2.i_num = 10;

    System.out.printf("%5s / %2d / %3d / %3d\n", c1.s_kind, c1.i_num, Card.i_width, Card.i_height);
    System.out.printf("%5s / %2d / %3d / %3d\n", c2.s_kind, c2.i_num, Card.i_width, Card.i_height);



  }
}
