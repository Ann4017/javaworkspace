package com.javachobo.modifier;

public class Time {
  // ���� ������
  // Ŭ���� �� ���� ���� (������ ��Ű���� ��ġ)
  // public > protected > default > private
  // public : ��� ��Ű���� Ŭ�������� ���
  // protected : ���� ��Ű���� Ŭ������ �ٸ� ��Ű�� �� ��Ӱ��迡 �ִ� Ŭ������ ��� ����
  // default : ���� ��Ű���� Ŭ����
  // private : �ش� Ŭ���� �� ������ ��� ����

  // class : public, default
  // var(�������) : public, protected, default, private
  // mathod : public, protected, default, private
  // constructor : public, protected, default, private

  // public int hour;
  // public int min;
  // public int sec;


  // private int hour;
  // private int min;
  // private int sec;

  int hour;
  int min;
  int sec;

  // getter, setter �б�, ����
  // public �� ���� ������ �ܺο��� �������� ���Ѵ�.
  // IDE ���� ��� Source �� ���� get/set �� �� ���� ���� �� �ִ�.

  public int getHour() {
    return hour;
  }

  public void setHour(int hour) {
    this.hour = hour;
  }

  public int getMin() {
    return min;
  }

  public void setMin(int min) {
    this.min = min;
  }

  public int getSec() {
    return sec;
  }

  public void setSec(int sec) {
    this.sec = sec;
  }

  // public void setHour(int hour) {
  // if (hour < 0 || hour > 23) {
  // System.out.println("��ȿ�� ������ �ƴմϴ�.");
  // return;
  // }
  // this.hour = hour;
  // }
  //
  // public int getHour() {
  // return hour;
  // }



}
