import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Tcp_ip_client {

  public static void main(String[] args) {
    // 192.168.0.41
    System.out.println("서버에 연결 중 : " + "192.168.0.41");

    try {
      Socket socket = new Socket("192.168.0.41", 8080);
      InputStream in = socket.getInputStream();
      DataInputStream dis = new DataInputStream(in);

      System.out.println("서버로 부터 받은 메시지 : " + dis.readUTF());

      dis.close();
      socket.close();

    } catch (UnknownHostException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }

}
