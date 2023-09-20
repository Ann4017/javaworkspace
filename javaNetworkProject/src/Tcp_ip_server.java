import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Tcp_ip_server {

  @SuppressWarnings("resource")
  public static void main(String[] args) {

    ServerSocket server_socket = null;

    try {
      server_socket = new ServerSocket(8080);
      System.out.println(get_time() + "서버 준비 완료");
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    while (true) {
      System.out.println(get_time() + "연결 요청 대기");
      try {
        Socket socket = server_socket.accept();
        System.out.println(get_time() + socket.getInetAddress() + " 로 부터 연결 요청");
        OutputStream out = socket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(out);

        dos.writeUTF("[Notice] 연결 확인");

        dos.close();
        socket.close();

      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }

  }

  static String get_time() {
    SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
    return f.format(new Date());
  }

}
