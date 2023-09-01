package javaOOP3Project;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Date_test {

  public static void main(String[] args) {

    // �ð� ������ ������ �����ϴ�.
    // Date day = new Date();
    // System.out.println(day);
    Calendar today = Calendar.getInstance(); // ��ü ���� ����� new�� ������� �ʴ� Ŭ����

    Date day = today.getTime();
    SimpleDateFormat sd = new SimpleDateFormat("yyyy.MM.dd");
    System.out.println(sd.format(day));

    System.out.println(today.get(Calendar.YEAR));
    System.out.println(today.get(Calendar.MONTH) + 1); // 0 ~ 11
    System.out.println(today.get(Calendar.DATE));
    System.out.println(today.get(Calendar.DAY_OF_YEAR));
    System.out.println(today.get(Calendar.DAY_OF_WEEK)); // 1 ~ 7 = �� ~ �����

    System.out.println(today.get(Calendar.HOUR));
    System.out.println(today.get(Calendar.MINUTE));
    System.out.println(today.get(Calendar.SECOND));

    System.out.println(today.getActualMaximum(Calendar.DATE)); // ���� ��¥�� ������ �ϼ��� �˾ƺ��� �޼ҵ�


  }

}
