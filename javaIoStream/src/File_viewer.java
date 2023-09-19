import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class File_viewer {

  public static void main(String[] args) throws IOException {

    FileInputStream fis = new FileInputStream("src/File_viewer.java");
    InputStreamReader reader = new InputStreamReader(fis, "utf-8");
    BufferedReader br = new BufferedReader(reader);

    // FileOutputStream fos = new FileOutputStream("src/File_copy.txt"); // 파일이 없다면 자동생성

    int data = 0; // read() 1 byte 씩 읽어온다.

    while ((data = br.read()) != -1) {
      char c = (char) data;
      System.out.print(c);
    }


    // int data = 0;
    // while ((data = fis.read()) != -1) {
    // fos.write(data);
    // }

  }


}
