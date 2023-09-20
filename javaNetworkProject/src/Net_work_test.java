import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Net_work_test {

  public static void main(String[] args) {

    URL url = null;
    BufferedReader input = null;

    String addr = "https://www.google.com/";
    String line = "";

    try {
      url = new URL(addr);
      InputStreamReader is = new InputStreamReader(url.openStream());
      input = new BufferedReader(is);

      while ((line = input.readLine()) != null) {
        System.out.println(line);
      }
      input.close();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }

}
