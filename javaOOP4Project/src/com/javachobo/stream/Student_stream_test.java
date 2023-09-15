package com.javachobo.stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class Student_stream_test {

  public static void main(String[] args) {

    Stream<Student> stu_stream = Stream.of(new Student("abh", 3, 300), new Student("bbh", 1, 200),
        new Student("cbh", 2, 240), new Student("dbh", 1, 100), new Student("ebh", 2, 220));

    // ���� ���� ������ score -> ban ���� �� ban ���� score �� �⺻ ����
    stu_stream
        .sorted(Comparator.comparing(Student::getBan).thenComparing(Comparator.naturalOrder()))
        .forEach(System.out::println);
    // stu_stream.sorted(Comparator.reverseOrder()).forEach(System.out::println);



  }

}
