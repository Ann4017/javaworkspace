import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Data_input_stream {

  public static void main(String[] args) {

    FileInputStream fis = null;
    DataInputStream dis = null;

    try {
      fis = new FileInputStream("src/sample.dat");
      dis = new DataInputStream(fis);

      int i = dis.readInt(); // output 과 쓰고 읽는 순서가 같아야 한다.
      float f = dis.readFloat();
      boolean b = dis.readBoolean();

      System.out.println(i);
      System.out.println(f);
      System.out.println(b);

    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }


  }

}
