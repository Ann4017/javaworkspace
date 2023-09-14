import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentManager {
  private Scanner scanner = new Scanner(System.in);
  private ArrayList<Student> dept = new ArrayList<Student>();



  private void read() {
    System.out.println("�л� �̸�,�а�,�й�,������� �Է��ϼ���.");
    while (true) {
      System.out.print(">> ");
      String text = scanner.nextLine();
      StringTokenizer st = new StringTokenizer(text, ",");

      if (st.countTokens() == 4) {
        Student stu = new Student(st.nextToken(), st.nextToken(), st.nextToken(),
            Double.parseDouble(st.nextToken()));
        dept.add(stu);
      } else {
        System.out.println("��Ŀ� �°� �Է����ּ���.");
      }

      if (dept.size() == 4) {
        break;
      }
      // ArrayList�� ����
    }
  }

  private void printAll() { // �Ϻη� Iterator�� �ۼ��� ������
    Iterator<Student> it = dept.iterator();
    while (it.hasNext()) {
      Student stu = it.next();
      System.out.println(stu.getName() + stu.getDepartment() + stu.getId() + stu.getGrade())1;
      System.out.printf("%s %s %s %d\n", stu.getName(), stu.getDepartment(), stu.getId(),
          stu.getGrade());
      // �л� ���� ���
    }
  }

  private void processQuery() {
    while (true) {
      System.out.print("�л� �̸� >> ");
      String name = scanner.nextLine(); // �л� �̸� �Է�

      if (name.equals("�׸�")) {
        return; // ����
      }

      for (int i = 0; i < dept.size(); i++) { // dept�� �ִ� ��� �л� �˻�
        if (name.equals(dept.get(i))) {
          System.out.println(dept.get(i));
        }

      } // end of while
    }
  }

  public void run() {
    read();
    printAll();
    // processQuery();
  }


}
