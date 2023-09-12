import java.util.HashMap;
import java.util.Scanner;

public class HashMapNation {
  public static void main(String[] args) {
    HashMap<String, Integer> nations = new HashMap<String, Integer>();
    Scanner scanner = new Scanner(System.in);
    String s_stop = "stop";


    System.out.println("���� �̸��� �α��� 10�� �Է��ϼ���.(��: Korea 5000)");
    while (true) { // "�׸�"�� �Էµ� ������ �ݺ�

      String s_country;
      int i_population;

      System.out.print("���� �̸�, �α� >> ");

      String s_input = scanner.nextLine();

      if (s_input.equals(s_stop)) {
        break;
      }

      String[] str = s_input.split(" ");
      if (str.length == 2) {
        s_country = str[0];
        i_population = Integer.parseInt(str[1]);

        nations.put(s_country, i_population);
      } else {
        System.out.println("���Ŀ� ���� �ʽ��ϴ�.");
      }

    }


    while (true) {
      System.out.print("�α� �˻� >> ");
      String s_country = scanner.next();

      if (s_country.equals(s_stop)) {
        break;
      }

      if (nations.containsKey(s_country)) {
        System.out.printf("Country | Population\n");
        System.out.printf("%-7s | %-10d\n", s_country, nations.get(s_country));
      } else {
        System.out.println("������ ã�� �� �����ϴ�.");
      }

    }
    scanner.close();
  }

}
