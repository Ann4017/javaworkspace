package javaOOP3Project;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Date_test {

  public static void main(String[] args) {

    // 시간 정보는 연산이 가능하다.
    // Date day = new Date();
    // System.out.println(day);
    Calendar today = Calendar.getInstance(); // 객체 생성 방식이 new를 사용하지 않는 클래스

    Date day = today.getTime();
    SimpleDateFormat sd = new SimpleDateFormat("yyyy.MM.dd");
    System.out.println(sd.format(day));

    System.out.println(today.get(Calendar.YEAR));
    System.out.println(today.get(Calendar.MONTH) + 1); // 0 ~ 11
    System.out.println(today.get(Calendar.DATE));
    System.out.println(today.get(Calendar.DAY_OF_YEAR));
    System.out.println(today.get(Calendar.DAY_OF_WEEK)); // 1 ~ 7 = 일 ~ 토요일

    System.out.println(today.get(Calendar.HOUR));
    System.out.println(today.get(Calendar.MINUTE));
    System.out.println(today.get(Calendar.SECOND));

    System.out.println(today.getActualMaximum(Calendar.DATE)); // 현재 날짜의 마지막 일수를 알아보는 메소드


  }

}
