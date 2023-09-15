package com.javachobo.functional;

import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntUnaryOperator;

public class Lamda_test3 {

  public static void main(String[] args) {

    IntSupplier s = () -> (int) (Math.random() * 100) + 1;
    IntConsumer c = i -> System.out.print(i + ", ");
    IntPredicate p = i -> i % 2 == 0;
    IntUnaryOperator op = i -> i + 10;

    int[] arr = new int[10];

    make_random_list(s, arr);
    System.out.println(Arrays.toString(arr));
    print_even_num(p, c, arr);
    int[] new_arr = do_something(op, arr);
    System.out.println(Arrays.toString(new_arr));

  }

  static void make_random_list(IntSupplier s, int[] arr) {

    for (int i = 0; i < arr.length; i++) {
      arr[i] = s.getAsInt();
    }
  }

  static void print_even_num(IntPredicate p, IntConsumer c, int[] arr) {

    for (int i : arr) {
      if (p.test(i)) {
        c.accept(i);
      }
    }
    System.out.println();
  }

  static int[] do_something(IntUnaryOperator op, int[] arr) {

    int[] new_arr = new int[arr.length];

    for (int i = 0; i < new_arr.length; i++) {
      new_arr[i] = op.applyAsInt(arr[i]);
    }
    return new_arr;
  }

}
