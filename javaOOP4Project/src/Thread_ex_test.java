import javax.swing.JOptionPane;

public class Thread_ex_test {

  public static void main(String[] args) {

    Thread_ex7 th7 = new Thread_ex7();
    th7.start();

    String input = JOptionPane.showInputDialog("�� �Է�:");
    System.out.println("�Է� ���� " + input + "�Դϴ�.");


  }

}
