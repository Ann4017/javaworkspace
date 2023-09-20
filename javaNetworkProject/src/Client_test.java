import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client_test {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("아이디 입력");
    String name = sc.nextLine();
    String server_ip = "192.168.0.41";

    try {
      Socket socket = new Socket(server_ip, 7777);
      Thread sender = new Thread(new Client_sender(socket, name));
      Thread receiver = new Thread(new Client_receiver(socket));

      sender.start();
      receiver.start();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    System.out.println("서버 연결 완료");
  } // main

  static class Client_sender extends Thread {
    @Override
    public void run() {
      Scanner sc = new Scanner(System.in);
      try {
        if (out != null) {
          out.writeUTF(name);
        }
        while (out != null) {
          out.writeUTF("[" + name + "]" + sc.nextLine());
        }
      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }

    Socket socket;
    DataOutputStream out;
    String name;

    public Client_sender(Socket socket, String name) {
      super();
      this.socket = socket;

      try {
        out = new DataOutputStream(socket.getOutputStream());
        this.name = name;
      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }


  }

  static class Client_receiver extends Thread {

    Socket socket;
    DataInputStream in;

    public Client_receiver(Socket socket) {
      super();
      this.socket = socket;

      try {
        in = new DataInputStream(socket.getInputStream());
      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    } // Client_receiver end

    @Override
    public void run() {

      while (in != null) {
        try {
          System.out.println(in.readUTF());
        } catch (IOException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
      }
    }
  }


}

