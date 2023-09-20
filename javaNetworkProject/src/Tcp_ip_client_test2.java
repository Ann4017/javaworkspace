import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Tcp_ip_client_test2 {

  public static void main(String[] args) {

    String addr = "192.168.0.41";

    try {
      Socket socket = new Socket(addr, 8080);
      System.out.println("서버 연결 완료");

      Sender sender = new Sender(socket);
      Receiver receiver = new Receiver(socket);

      sender.start();
      receiver.start();

    } catch (UnknownHostException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

}
