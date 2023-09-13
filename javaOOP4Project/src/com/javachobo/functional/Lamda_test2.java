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


    Supplier<Integer> s = () -> (int) (Math.random() * 100) + 1; // 지정리턴
    // s.get()
    Consumer<Integer> c = i -> System.out.print(i + ", "); // 매개변수
    // c.accept(t);
    Predicate<Integer> p = i -> i % 2 == 0; // 매개변수, 논리형 리턴
    // p.test(t)
    Function<Integer, Integer> f = i -> i / 10 * 10; // 매개변수, 지정 리턴
    // f.apply(t)

    List<Integer> list = new ArrayList<>();

    Lamda_test2.<Integer>make_random_list(s, list); // 제네릭한 메소드를 사용 할 때는 타입 명시 전 클래스의 이름이 반드시
                                                    // 들어가야한다.
    // 타입 유추가 가능한 경우는 제네릭 명시를 생략 할 수 있다.

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


  // 람다식에서의 메소드 참조
  // 람다식이 하나의 메소드만 호출하는 경우
  // 클래스::메소드

  // 함수형 인터페이스
  Function<String, Integer> f1 = (String _s) -> Integer.parseInt(_s);
  BiFunction<String, String, Boolean> bf1 = (_s1, _s2) -> _s1.equals(_s2);
  // 메소드 참조
  Function<String, Integer> f2 = Integer::parseInt;
  BiFunction<String, String, Boolean> bf2 = String::equals;


  // class My_class{}
  // 기본
  // My_class m = new My_class
  // 생성자의 메소드 참조
  // Supplier<My_class> s1 = ()-> My_class::new;
  // Function<Integer, My_class> s2 = My_class::new;
  // BiFunction<Integer, Integer , My_class> s3 = My_class::new;

  // 배열 생성
  Function<Integer, int[]> f3 = (x) -> new int[x];
  Function<Integer, int[]> f4 = int[]::new;

  Supplier<Lamda_test2> ss = Lamda_test2::new;

}
