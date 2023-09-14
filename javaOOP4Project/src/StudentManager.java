import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentManager {
  private Scanner scanner = new Scanner(System.in);
  private ArrayList<Student> dept = new ArrayList<Student>();



  private void read() {

    System.out.println("�л� �̸�,�а�,�й�,������� �Է��ϼ���.");
    int count = 0;

    while (count < 4) {
      System.out.print(">> ");
      String text = scanner.nextLine();
      StringTokenizer st = new StringTokenizer(text, ",");

      if (st.countTokens() == 4) {
        Student stu = new Student(st.nextToken(), st.nextToken(), st.nextToken(),
            Double.parseDouble(st.nextToken()));
        dept.add(stu);
        count++;
      } else {
        System.out.println("��Ŀ� �°� �Է����ּ���.");
      }

      // ArrayList�� ����
    }
  }

  private void printAll() { // �Ϻη� Iterator�� �ۼ��� ������
    Iterator<Student> it = dept.iterator();
    while (it.hasNext()) {
      Student stu = it.next();

      System.out.printf("�̸�: %s, �а�: %s, �й�: %s, �������: %.1f\n", stu.getName(), stu.getDepartment(),
          stu.getId(), stu.getGrade());
      // �л� ���� ���
    }
  }

  private void processQuery() {
    while (true) {
      System.out.print("�л� �̸� >> ");
      String name = scanner.nextLine(); // �л� �̸� �Է�
      boolean found = false;

      if (name.equals("�׸�")) {
        return; // ����
      }



      for (int i = 0; i < dept.size(); i++) { // dept�� �ִ� ��� �л� �˻�

        Student stu = dept.get(i);

        if (name.equals(stu.getName())) {
          System.out.printf("�̸�: %s, �а�: %s, �й�: %s, �������: %.1f\n", stu.getName(),
              stu.getDepartment(), stu.getId(), stu.getGrade());
          found = true;
          break;
        }
      } // end of while

      if (!found) {
        System.out.println("ã�� �� ���� �л� ���� �Դϴ�.");
      }
    }
  }

  public void run() {
    read();
    printAll();
    processQuery();
    scanner.close();
  }


}
