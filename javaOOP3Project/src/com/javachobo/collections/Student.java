package com.javachobo.collections;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Student implements Comparable {

  String name;
  int ban;
  int ko;
  int kor, eng, math;

  int get_total() {
    return kor + eng + math;
  }

  float get_avg() {
    return get_total() / 3.0f;
  }

  @Override
  public int compareTo(Object o) {

    if (o instanceof Student) {
      Student other = (Student) o;
      // return this.ko - other.ko; // 1, 0, -1 대표 값 오름차순
      return other.ko - this.ko; // 내림차순
    }

    return 0;
  }



}
