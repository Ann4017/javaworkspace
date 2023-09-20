import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Net_work_test2 {

  public static void main(String[] args) {

    URL url = null;
    InputStream in = null;
    FileOutputStream out = null;
    String addr = "https://ckw7407.dothome.co.kr/git.zip";

    int ch = 0;

    try {
      url = new URL(addr);
      in = url.openStream();
      out = new FileOutputStream("down_git.zip");

      while ((ch = in.read()) != -1) {
        out.write(ch);
      }
      out.close();
      in.close();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }

}
