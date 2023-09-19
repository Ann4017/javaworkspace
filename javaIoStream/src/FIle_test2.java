import java.io.File;

public class FIle_test2 {

  public static void main(String[] args) {

    // 폴더, 파일
    // 먼저 구분 하지않고 디렉토리 취급하고 가져온다

    File f = new File("C:\\Users\\abh\\Desktop\\File");

    if (!f.exists() || !f.isDirectory()) {
      System.out.println("Nothing");
      System.exit(0);
    }
    File[] files = f.listFiles();

    for (int i = 0; i < files.length; i++) {
      String file_name = files[i].getName();
      System.out.println(files[i].isDirectory() ? "[dir] " + file_name : file_name);
    }
  }

}
