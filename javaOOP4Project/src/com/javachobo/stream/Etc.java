package com.javachobo.stream;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Etc {

  // Stream
  // 데이터 소스의 종류와 상관없이 같은 방식 다를 수 있게하고 재사용을 높이기 위한 방법
  // (배열, 컬렉션)
  // 스트림 형식의 값은 한번 만 사용이 가능하다. (일회성)

  public static void main(String[] args) {

    String[] arr_str = {"aaa", "bbb", "ccc"};
    List<String> str_list = Arrays.asList(arr_str);

    // List -> Stream
    Stream<String> str_stream1 = str_list.stream(); // 스트림 생성 (구조 변경)
    Stream<String> str_stream2 = Arrays.stream(arr_str);

    // str_stream1.sorted().forEach(i -> System.out.println(i));
    str_stream1.sorted().forEach(System.out::println); // 람다식의 메소드 참조 방식

    // 이전 방식
    Arrays.sort(arr_str);
    for (String str : arr_str) {
      System.out.println(str);
    }

    // 스트림 타입을 리스트로 되돌리기
    List<String> sorted = str_stream2.sorted().collect(Collectors.toList());
    System.out.println(sorted);

    // 일회성
    System.out.println("==============");
    Stream<String> str_stream3 = str_list.stream(); // 한번 사용하면 다시 새로 생성줘야한다.
    str_stream3.sorted().forEach(System.out::println);
    // long count = str_stream3.count();


    // 스트림의 연산 -
    // 중간 연산 : 연속해서 여러번 가능, 데이터를 변경하지 않는다.
    // distinct(), filter(), limit(), sort(), map()
    // 최종 연산 : 한번만 가능, 데이터가 변경된다.
    // forEach()

    // String[] str_arr = {"dd", "aaa", "CC", "cc", "b"};
    // Stream<String> stream = Stream.of(str_arr); // 스트림 생성
    // Stream<String> filter_stream = stream.filter(predicate);
    // Stream<String> distinct_stream = stream.distinct();
    // long num = stream.count();


    // 배열의 스트림 생성
    // Stream<T> @ = Stream.of(T... values);
    // Stream<T> @ = Stream.of(T[]);
    // Stream<T> @ = Arrays.stream(T[]);

    // 자료형 배열의 스트림 생성
    // IntStream @ = IntStream.of(int... value);
    // IntStream @ = IntStream.of(int[]);
    // IntStream @ = Arrays.stream(int[]);

    // 특정 정수 범위를 스트림으로 생성
    // IntStream @ = IntStream.range(strat, end); // 1, 5 = 1 ~ 4
    // IntStream @ = IntStream.rangeClosed(strat, end); // 1, 5 = 1 ~ 5
    // @.forEach(System.out::print);

    // 임의 수
    // IntStream @ = new Random().ints(); // 무한 스트림
    // @.limit(5).forEach(System.out::print); // 무한 스트림 안에 있는 5개 의 값만 출력

    // IntStream @ = new Random().ints(1,5); // 1 ~ 5 범위 안의 무한 스트림
    // @.limit(2).forEach(System.out::print); // 무한 스트림 안에 있는 2개 의 값만 출력


    // 스트림의 중간 연산
    System.out.println();
    // IntStream int_stream = IntStream.rangeClosed(1, 10);
    // int_stream.skip(3).limit(5).forEach(System.out::println); // 앞 3칸은 제외하고 5개까지 출력하라

    // IntStream int_stream = IntStream.of(1, 2, 2, 3, 3, 3, 4, 5, 5, 6);
    // int_stream.distinct().forEach(System.out::println);; // 중복 제거

    // IntStream int_stream = IntStream.range(1, 11);
    // int_stream.filter(i -> i % 2 == 0).forEach(System.out::println);;

    // 스트림 정렬
    String[] arr = {"dd", "aaa", "bbb", "d", "a"};
    Stream<String> stream = Stream.of(arr);
    // stream.sorted().forEach(System.out::println); // 오름차순
    // stream.sorted(Comparator.reverseOrder()).forEach(System.out::println); // 내림차순

    // 다른 방식
    // Comparator.comparing(keyExtractor);
    // thenComparing();


    // map()
    // 원하는 특정 값만 뽑아 오거나, 특정 형태로 변환
    Stream<File> file_stream = Stream.of(new File("Ex1.java"), new File("Ex1"), new File("Ex1.bak"),
        new File("Ex2.java"), new File("Ex1.txt"));

    // peek(); 중간 연산 중 제대로 작동하고 있는지 확인용도
    file_stream.map(File::getName).filter(i -> i.indexOf('.') != -1)
        .peek(i -> System.out.printf("file_name : %s\n", i))
        .map(i -> i.substring(i.indexOf('.') + 1)).peek(i -> System.out.printf("ext : %s\n", i))
        .map(String::toUpperCase).distinct().forEach(System.out::println);
  }

}
