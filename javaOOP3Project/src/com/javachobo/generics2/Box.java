package com.javachobo.generics2;

import java.util.ArrayList;

public class Box<T> {

  ArrayList<T> list = new ArrayList<T>();

  void add(T item) {
    list.add(item);
  }

  T get(int i) {
    return list.get(i);
  }

  ArrayList<T> get_list() {
    return list;
  }

  int size() {
    return list.size();
  }

  public String toString() {
    return list.toString();
  }
}
