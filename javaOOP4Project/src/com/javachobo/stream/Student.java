package com.javachobo.stream;

public class Student implements Comparable<Student> {

  String name;
  int ban;
  int total_socre;

  @Override
  public String toString() {
    return "student [name=" + name + ", ban=" + ban + ", total_socre=" + total_socre + "]";
  }

  @Override
  public int compareTo(Student s) {
    return s.total_socre - this.total_socre; // 성적 기준 내림차순
  }

  public Student(String name, int ban, int total_socre) {
    super();
    this.name = name;
    this.ban = ban;
    this.total_socre = total_socre;
  }

  public String getName() {
    return name;
  }

  public int getBan() {
    return ban;
  }

  public int getTotal_socre() {
    return total_socre;
  }


}
