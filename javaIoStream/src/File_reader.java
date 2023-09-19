import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_reader {

  public static void main(String[] args) {

    try {
      FileReader fr = new FileReader("src/File_reader.java");
      FileWriter fw = new FileWriter("src/convert.txt");

      int data = 0;

      while ((data = fr.read()) != -1) {
        if (data != '\t' && data != '\n' && data != '\r') {
          fw.write(data);
        }
      }
      System.out.println("한글"); // reader, writer 에서는 내부적으로 인코딩이 이루어지기 때문에 한글이 깨지지 않는다.

      fr.close();
      fw.close();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

}
