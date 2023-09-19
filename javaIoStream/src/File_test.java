import java.io.File;
import java.io.IOException;

public class File_test {


  public static void main(String[] args) throws IOException {

    // File f = new File("C:\\Users\\abh\\javaworkspace\\javaOOPProject\\src\\Car.java");
    // String file_name = f.getName();
    //
    // int pos = file_name.lastIndexOf(".");
    // System.out.println(file_name.substring(0, pos));
    // System.out.println(file_name.substring(pos + 1));

    File f = new File("./../Car.java");
    // ./ 는 현재 디렉토리
    // ../ 는 현재 디렉토리의 상위 디렉토리로 이동

    System.out.println("경로를 포함한 파일이름 : " + f.getPath());
    System.out.println("파일의 절대 경로 : " + f.getAbsolutePath());
    System.out.println("파일의 정규 경로 : " + f.getCanonicalPath());
    System.out.println("파일이 속한 디렉토리 : " + f.getParent());
  }

}
