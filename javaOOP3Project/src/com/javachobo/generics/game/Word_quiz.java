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
    words.add(new Word("love", "���"));
    words.add(new Word("animal", "����"));
    words.add(new Word("emotion", "����"));
    words.add(new Word("human", "���"));
    words.add(new Word("stock", "�ֽ�"));
    words.add(new Word("trade", "�ŷ�"));
    words.add(new Word("society", "��ȸ"));
    words.add(new Word("baby", "�Ʊ�"));
    words.add(new Word("honey", "��"));
    words.add(new Word("doll", "����"));
    words.add(new Word("bear", "��"));
    words.add(new Word("picture", "����"));
    words.add(new Word("painting", "�׸�"));
    words.add(new Word("fault", "����"));
    words.add(new Word("example", "����"));
    words.add(new Word("eye", "��"));
    words.add(new Word("statue", "������"));
  }

  // ������ ���⸦ �����ϴ� ����
  // �迭�� ����ؼ� ���� 4���� �����Ѵ�.
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

  // ���� �߿� ������ ��/�� �� Ȯ���ϴ� ����
  boolean exists(int[] _n, int _index) {

    for (int i = 0; i < _n.length; i++) {
      if (_n[i] == _index) {
        return true;
      }
    }

    return false;
  }

  // ���� �޼ҵ�
  // ������ ���Ǵ� �ܾ�� ������ ������ �����ϴ� ����
  // ����Ǯ���� ���� ��/�� �� Ȯ���ϴ� ���
  void run() {

    Scanner sc = new Scanner(System.in);
    System.out.println(name + "�� �ܾ� �׽�Ʈ�� �����մϴ�. -1 �� �Է� �� ����");
    System.out.println("���� " + words.size() + "���� �ܾ ��� �ֽ��ϴ�.");

    while (true) {
      int answer_index = (int) (Math.random() * words.size());
      String eng = words.get(answer_index).getEng();

      int[] example = new int[4];

      int answer_loc = make_example(example, answer_index);
      example[answer_loc] = answer_index;

      // ���� ���
      System.out.println(eng + " = ?");
      // ���� ���
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
        System.out.println("����");
      } else {
        System.out.println("����");
      }

    }

    System.out.println("���� ����");
  }

}
