import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Tcp_ip_server2 {

  public static void main(String[] args) {

    ServerSocket server_socket = null;
    Socket socket = null;

    try {
      server_socket = new ServerSocket(8080);
      System.out.println("서버 준비");
      socket = server_socket.accept();

      Sender sender = new Sender(socket);
      Receiver receiver = new Receiver(socket);

      sender.start();
      receiver.start();

    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }

}
