package javaOOP3Project;

import java.util.Calendar;
import java.util.Scanner;

public class Calendar_test2 {

  public static void main(String[] args) {

    int end_day = 0;
    int start_day_of_week = 0;
    // int f_day = 0;


    Scanner sc = new Scanner(System.in);
    System.out.println("년 입력");
    int year = sc.nextInt();
    System.out.println("월 입력");
    int month = sc.nextInt();

    Calendar s_day = Calendar.getInstance();
    Calendar e_day = Calendar.getInstance();
    // Calendar a_day = Calendar.getInstance();

    s_day.set(year, month - 1, 1); // 2015.8.1
    e_day.set(year, month, 1); // 2015.9.1
    // a_day.set(year, month - 2);

    e_day.add(Calendar.DATE, -1); // 2015.8.31
    // a_day.add(Calendar.DATE, -start_day_of_week);


    // f_day = a_day.get(Calendar.DATE);
    end_day = e_day.get(Calendar.DATE); // 31

    start_day_of_week = s_day.get(Calendar.DAY_OF_WEEK); // 요일 정보


    System.out.println("       " + year + "년" + month + "월");
    System.out.println(" SU MO TU WE TH FR SA");

    for (int i = 1; i < start_day_of_week; i++) {
      System.out.print("   ");
    }

    for (int i = 1, n = start_day_of_week; i <= end_day; i++, n++) {

      System.out.print(i < 10 ? "  " + i : " " + i);
      if (n % 7 == 0) {
        System.out.println();
      }
    }

  }

}
