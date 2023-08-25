
public class TVCRTest {

  public static void main(String[] args) {
    TVCR t = new TVCR();

    t.channel = 30;
    t.channel_up();
    System.out.println(t.channel);

    t.power();
    t.play();
    t.stop();
    t.rew();
    t.ff();

  }

}
