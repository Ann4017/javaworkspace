package javaOOP3Project;

import java.util.Calendar;

public class Calendar_test {

  public static void main(String[] args) {

    final String[] DAY_OF_WEEK = {"", "일", "월", "화", "수", "목", "금", "토"};

    Calendar date1 = Calendar.getInstance();
    Calendar date2 = Calendar.getInstance();

    date1.set(2015, 7, 15);
    System.out.println("data1 : " + date1.get(Calendar.YEAR) + "년");
    System.out.println("data1 : " + date1.get(Calendar.MONTH) + "월");
    System.out.println("data1 : " + date1.get(Calendar.DATE) + "일");
    System.out.println("data1 : " + date1.get(Calendar.DAY_OF_WEEK));

    System.out.println("date1 : " + date1.get(Calendar.YEAR) + "년 "
        + (date1.get(Calendar.MONTH) + 1) + "월 " + date1.get(Calendar.DATE) + "일 "
        + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "요일");

    System.out.println("date2 : " + date2.get(Calendar.YEAR) + "년 "
        + (date2.get(Calendar.MONTH) + 1) + "월 " + date2.get(Calendar.DATE) + "일 "
        + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)] + "요일");


    long difference = (date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000;
    System.out.println("date1 과 date2 까지 " + difference + "초가 지났습니다.");
    System.out.println("date1 과 date2 까지 " + difference / (24 * 60 * 60) + "일이 지났습니다.");
  }

}
