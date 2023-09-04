package com.javachobo.collections;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Person {

  String name;
  int age;

  // @Override
  // public boolean equals(Object obj) {
  // if (obj instanceof Person) {
  // Person other = (Person) obj;
  // return this.name == other.name && this.age == other.age;
  // }
  // return false;
  // }
  //
  // @Override
  // public int hashCode() {
  // return Objects.hash(name, age);
  // }
}
