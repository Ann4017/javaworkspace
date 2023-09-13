package com.javachobo.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class Lamda_test2 {

  public static void main(String[] args) {


    Supplier<Integer> s = () -> (int) (Math.random() * 100) + 1; // ��������
    // s.get()
    Consumer<Integer> c = i -> System.out.print(i + ", "); // �Ű�����
    // c.accept(t);
    Predicate<Integer> p = i -> i % 2 == 0; // �Ű�����, ���� ����
    // p.test(t)
    Function<Integer, Integer> f = i -> i / 10 * 10; // �Ű�����, ���� ����
    // f.apply(t)

    List<Integer> list = new ArrayList<>();

    Lamda_test2.<Integer>make_random_list(s, list); // ���׸��� �޼ҵ带 ��� �� ���� Ÿ�� ��� �� Ŭ������ �̸��� �ݵ��
                                                    // �����Ѵ�.
    // Ÿ�� ���߰� ������ ���� ���׸� ��ø� ���� �� �� �ִ�.

    System.out.println(list);
    Lamda_test2.<Integer>print_even_num(p, c, list);
    System.out.println();

    List<Integer> new_list = do_something(f, list);
    System.out.println(new_list);
  }

  static <T> List<T> do_something(Function<T, T> _f, List<T> _list) {

    List<T> new_list = new ArrayList<T>(_list.size());

    for (T i : _list) {
      new_list.add(_f.apply(i));
    }

    return new_list;
  }

  static <T> void make_random_list(Supplier<T> _s, List<T> _list) {

    for (int i = 0; i < 10; i++) {
      _list.add(_s.get());
    }
  }

  static <T> void print_even_num(Predicate<T> _p, Consumer<T> _c, List<T> _list) {

    for (T i : _list) {
      if (_p.test(i)) {
        _c.accept(i);
      }
    }
  }


  // ���ٽĿ����� �޼ҵ� ����
  // ���ٽ��� �ϳ��� �޼ҵ常 ȣ���ϴ� ���
  // Ŭ����::�޼ҵ�

  // �Լ��� �������̽�
  Function<String, Integer> f1 = (String _s) -> Integer.parseInt(_s);
  BiFunction<String, String, Boolean> bf1 = (_s1, _s2) -> _s1.equals(_s2);
  // �޼ҵ� ����
  Function<String, Integer> f2 = Integer::parseInt;
  BiFunction<String, String, Boolean> bf2 = String::equals;


  // class My_class{}
  // �⺻
  // My_class m = new My_class
  // �������� �޼ҵ� ����
  // Supplier<My_class> s1 = ()-> My_class::new;
  // Function<Integer, My_class> s2 = My_class::new;
  // BiFunction<Integer, Integer , My_class> s3 = My_class::new;

  // �迭 ����
  Function<Integer, int[]> f3 = (x) -> new int[x];
  Function<Integer, int[]> f4 = int[]::new;

  Supplier<Lamda_test2> ss = Lamda_test2::new;

}
