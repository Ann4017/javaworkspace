import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Data_output_Stream {

  public static void main(String[] args) {

    FileOutputStream fos = null;
    DataOutputStream dos = null;

    try {
      fos = new FileOutputStream("src/sample.dat");
      dos = new DataOutputStream(fos);
      dos.writeInt(10);
      dos.writeFloat(20.0f);
      dos.writeBoolean(true);

      dos.close(); // 보조 스트림을 닫아주면 나머지다 상위에 열어놓은 스트림도 다 같이 닫힌다.
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }


  }

}
