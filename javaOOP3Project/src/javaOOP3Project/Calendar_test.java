package javaOOP3Project;

import java.util.Calendar;

public class Calendar_test {

  public static void main(String[] args) {

    final String[] DAY_OF_WEEK = {"", "��", "��", "ȭ", "��", "��", "��", "��"};

    Calendar date1 = Calendar.getInstance();
    Calendar date2 = Calendar.getInstance();

    date1.set(2015, 7, 15);
    System.out.println("data1 : " + date1.get(Calendar.YEAR) + "��");
    System.out.println("data1 : " + date1.get(Calendar.MONTH) + "��");
    System.out.println("data1 : " + date1.get(Calendar.DATE) + "��");
    System.out.println("data1 : " + date1.get(Calendar.DAY_OF_WEEK));

    System.out.println("date1 : " + date1.get(Calendar.YEAR) + "�� "
        + (date1.get(Calendar.MONTH) + 1) + "�� " + date1.get(Calendar.DATE) + "�� "
        + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "����");

    System.out.println("date2 : " + date2.get(Calendar.YEAR) + "�� "
        + (date2.get(Calendar.MONTH) + 1) + "�� " + date2.get(Calendar.DATE) + "�� "
        + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)] + "����");


    long difference = (date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000;
    System.out.println("date1 �� date2 ���� " + difference + "�ʰ� �������ϴ�.");
    System.out.println("date1 �� date2 ���� " + difference / (24 * 60 * 60) + "���� �������ϴ�.");
  }

}
