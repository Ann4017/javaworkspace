package javaOOP3Project;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Local_date_time_test {

  public static void main(String[] args) {

    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY.MM.dd a hh:mm:ss");
    System.out.println(now.format(dtf));

    // LocalDateTime result1 = now.plusYears(1);
    // System.out.println(result1.format(dtf));
    // LocalDateTime result2 = now.plusMinutes(20);
    // System.out.println(result2.format(dtf));
    // LocalDateTime result3 = now.plusMonths(2);
    // System.out.println(result3.format(dtf));

    LocalDateTime start_date_time = LocalDateTime.of(2023, 1, 1, 0, 0, 0);
    LocalDateTime end_date_time = LocalDateTime.of(2023, 12, 31, 0, 0, 0);

    if (start_date_time.isBefore(end_date_time)) {
      System.out.println("진행 중");
    } else if (start_date_time.isEqual(end_date_time)) {
      System.out.println("종료");
    } else if (start_date_time.isAfter(end_date_time)) {
      System.out.println("종료되었음");
    }

    long remain_year = start_date_time.until(end_date_time, ChronoUnit.YEARS);
    long remain_month = start_date_time.until(end_date_time, ChronoUnit.MONTHS);
    long remain_day = start_date_time.until(end_date_time, ChronoUnit.DAYS);

    System.out.println("년도 차이 : " + remain_year);
    System.out.println("월 차이 : " + remain_month);
    System.out.println("일 차이 : " + remain_day);


  }

}
