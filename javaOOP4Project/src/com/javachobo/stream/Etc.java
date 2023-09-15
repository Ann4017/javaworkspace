package com.javachobo.stream;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Etc {

  // Stream
  // ������ �ҽ��� ������ ������� ���� ��� �ٸ� �� �ְ��ϰ� ������ ���̱� ���� ���
  // (�迭, �÷���)
  // ��Ʈ�� ������ ���� �ѹ� �� ����� �����ϴ�. (��ȸ��)

  public static void main(String[] args) {

    String[] arr_str = {"aaa", "bbb", "ccc"};
    List<String> str_list = Arrays.asList(arr_str);

    // List -> Stream
    Stream<String> str_stream1 = str_list.stream(); // ��Ʈ�� ���� (���� ����)
    Stream<String> str_stream2 = Arrays.stream(arr_str);

    // str_stream1.sorted().forEach(i -> System.out.println(i));
    str_stream1.sorted().forEach(System.out::println); // ���ٽ��� �޼ҵ� ���� ���

    // ���� ���
    Arrays.sort(arr_str);
    for (String str : arr_str) {
      System.out.println(str);
    }

    // ��Ʈ�� Ÿ���� ����Ʈ�� �ǵ�����
    List<String> sorted = str_stream2.sorted().collect(Collectors.toList());
    System.out.println(sorted);

    // ��ȸ��
    System.out.println("==============");
    Stream<String> str_stream3 = str_list.stream(); // �ѹ� ����ϸ� �ٽ� ���� ��������Ѵ�.
    str_stream3.sorted().forEach(System.out::println);
    // long count = str_stream3.count();


    // ��Ʈ���� ���� -
    // �߰� ���� : �����ؼ� ������ ����, �����͸� �������� �ʴ´�.
    // distinct(), filter(), limit(), sort(), map()
    // ���� ���� : �ѹ��� ����, �����Ͱ� ����ȴ�.
    // forEach()

    // String[] str_arr = {"dd", "aaa", "CC", "cc", "b"};
    // Stream<String> stream = Stream.of(str_arr); // ��Ʈ�� ����
    // Stream<String> filter_stream = stream.filter(predicate);
    // Stream<String> distinct_stream = stream.distinct();
    // long num = stream.count();


    // �迭�� ��Ʈ�� ����
    // Stream<T> @ = Stream.of(T... values);
    // Stream<T> @ = Stream.of(T[]);
    // Stream<T> @ = Arrays.stream(T[]);

    // �ڷ��� �迭�� ��Ʈ�� ����
    // IntStream @ = IntStream.of(int... value);
    // IntStream @ = IntStream.of(int[]);
    // IntStream @ = Arrays.stream(int[]);

    // Ư�� ���� ������ ��Ʈ������ ����
    // IntStream @ = IntStream.range(strat, end); // 1, 5 = 1 ~ 4
    // IntStream @ = IntStream.rangeClosed(strat, end); // 1, 5 = 1 ~ 5
    // @.forEach(System.out::print);

    // ���� ��
    // IntStream @ = new Random().ints(); // ���� ��Ʈ��
    // @.limit(5).forEach(System.out::print); // ���� ��Ʈ�� �ȿ� �ִ� 5�� �� ���� ���

    // IntStream @ = new Random().ints(1,5); // 1 ~ 5 ���� ���� ���� ��Ʈ��
    // @.limit(2).forEach(System.out::print); // ���� ��Ʈ�� �ȿ� �ִ� 2�� �� ���� ���


    // ��Ʈ���� �߰� ����
    System.out.println();
    // IntStream int_stream = IntStream.rangeClosed(1, 10);
    // int_stream.skip(3).limit(5).forEach(System.out::println); // �� 3ĭ�� �����ϰ� 5������ ����϶�

    // IntStream int_stream = IntStream.of(1, 2, 2, 3, 3, 3, 4, 5, 5, 6);
    // int_stream.distinct().forEach(System.out::println);; // �ߺ� ����

    // IntStream int_stream = IntStream.range(1, 11);
    // int_stream.filter(i -> i % 2 == 0).forEach(System.out::println);;

    // ��Ʈ�� ����
    String[] arr = {"dd", "aaa", "bbb", "d", "a"};
    Stream<String> stream = Stream.of(arr);
    // stream.sorted().forEach(System.out::println); // ��������
    // stream.sorted(Comparator.reverseOrder()).forEach(System.out::println); // ��������

    // �ٸ� ���
    // Comparator.comparing(keyExtractor);
    // thenComparing();


    // map()
    // ���ϴ� Ư�� ���� �̾� ���ų�, Ư�� ���·� ��ȯ
    Stream<File> file_stream = Stream.of(new File("Ex1.java"), new File("Ex1"), new File("Ex1.bak"),
        new File("Ex2.java"), new File("Ex1.txt"));

    // peek(); �߰� ���� �� ����� �۵��ϰ� �ִ��� Ȯ�ο뵵
    file_stream.map(File::getName).filter(i -> i.indexOf('.') != -1)
        .peek(i -> System.out.printf("file_name : %s\n", i))
        .map(i -> i.substring(i.indexOf('.') + 1)).peek(i -> System.out.printf("ext : %s\n", i))
        .map(String::toUpperCase).distinct().forEach(System.out::println);
  }

}
