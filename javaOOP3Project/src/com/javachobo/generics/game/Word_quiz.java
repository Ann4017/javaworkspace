package com.javachobo.generics.game;

import java.util.ArrayList;
import java.util.Scanner;

public class Word_quiz {

  private String name;
  private ArrayList<Word> words;

  public Word_quiz(String name) {
    super();
    this.name = name;
    words = new ArrayList<>();
    words.add(new Word("love", "사랑"));
    words.add(new Word("animal", "동물"));
    words.add(new Word("emotion", "감정"));
    words.add(new Word("human", "사람"));
    words.add(new Word("stock", "주식"));
    words.add(new Word("trade", "거래"));
    words.add(new Word("society", "사회"));
    words.add(new Word("baby", "아기"));
    words.add(new Word("honey", "꿀"));
    words.add(new Word("doll", "인형"));
    words.add(new Word("bear", "곰"));
    words.add(new Word("picture", "사진"));
    words.add(new Word("painting", "그림"));
    words.add(new Word("fault", "오류"));
    words.add(new Word("example", "보기"));
    words.add(new Word("eye", "눈"));
    words.add(new Word("statue", "조각상"));
  }

  // 문제의 보기를 구성하는 역할
  // 배열을 사용해서 보기 4개를 구성한다.
  int make_example(int[] _ex, int _answer_index) {

    int[] n = {-1, -1, -1, -1};
    int index;

    for (int i = 0; i < n.length; i++) {
      do {
        index = (int) (Math.random() * words.size());
      } while (index == _answer_index || exists(n, index));
      n[i] = index;
    }

    System.arraycopy(n, 0, _ex, 0, n.length);

    return (int) (Math.random() * n.length);
  }

  // 보기 중에 정답의 유/무 를 확인하는 역할
  boolean exists(int[] _n, int _index) {

    for (int i = 0; i < _n.length; i++) {
      if (_n[i] == _index) {
        return true;
      }
    }

    return false;
  }

  // 시작 메소드
  // 문제에 사용되는 단어와 보기의 정답을 구성하는 역할
  // 문제풀이의 정답 유/무 를 확인하는 기능
  void run() {

    Scanner sc = new Scanner(System.in);
    System.out.println(name + "의 단어 테스트를 시작합니다. -1 을 입력 시 종료");
    System.out.println("현재 " + words.size() + "개의 단어가 들어 있습니다.");

    while (true) {
      int answer_index = (int) (Math.random() * words.size());
      String eng = words.get(answer_index).getEng();

      int[] example = new int[4];

      int answer_loc = make_example(example, answer_index);
      example[answer_loc] = answer_index;

      // 문제 출력
      System.out.println(eng + " = ?");
      // 보기 출력
      for (int i = 0; i < example.length; i++) {
        System.out.println("(" + (i + 1) + ")" + words.get(example[i]).getKor() + " ");
      }

      System.out.println(":>>");

      int in = sc.nextInt(); // 1 ~ 4
      if (in == -1) {
        break;
      }
      in--;

      if (in == answer_loc) {
        System.out.println("정답");
      } else {
        System.out.println("오답");
      }

    }

    System.out.println("게임 종료");
  }

}
