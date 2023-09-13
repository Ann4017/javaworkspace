package com.javachobo.functional;

import java.util.ArrayList;

public class Func_ex {

  static <T> void print_arr(ArrayList<T> _arr_list) {

    for (T num : _arr_list) {
      System.out.println(num);
    }

  }

}
