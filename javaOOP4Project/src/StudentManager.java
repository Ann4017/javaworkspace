import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentManager {
  private Scanner scanner = new Scanner(System.in);
  private ArrayList<Student> dept = new ArrayList<Student>();



  private void read() {

    System.out.println("학생 이름,학과,학번,학점평균 입력하세요.");
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
        System.out.println("양식에 맞게 입력해주세요.");
      }

      // ArrayList에 저장
    }
  }

  private void printAll() { // 일부러 Iterator로 작성해 보았음
    Iterator<Student> it = dept.iterator();
    while (it.hasNext()) {
      Student stu = it.next();

      System.out.printf("이름: %s, 학과: %s, 학번: %s, 학점평균: %.1f\n", stu.getName(), stu.getDepartment(),
          stu.getId(), stu.getGrade());
      // 학생 정보 출력
    }
  }

  private void processQuery() {
    while (true) {
      System.out.print("학생 이름 >> ");
      String name = scanner.nextLine(); // 학생 이름 입력
      boolean found = false;

      if (name.equals("그만")) {
        return; // 종료
      }



      for (int i = 0; i < dept.size(); i++) { // dept에 있는 모든 학생 검색

        Student stu = dept.get(i);

        if (name.equals(stu.getName())) {
          System.out.printf("이름: %s, 학과: %s, 학번: %s, 학점평균: %.1f\n", stu.getName(),
              stu.getDepartment(), stu.getId(), stu.getGrade());
          found = true;
          break;
        }
      } // end of while

      if (!found) {
        System.out.println("찾을 수 없는 학생 정보 입니다.");
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
