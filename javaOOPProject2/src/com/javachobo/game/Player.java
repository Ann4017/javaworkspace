package com.javachobo.game;

import java.util.Scanner;

public class Player {

  private String name; // �ܺο��� ���� �Ұ� , �����ڿ��� �ʱ�ȭ
  private String word;
  private Scanner scanner;

  public Player(String name) {
    super();
    this.name = name;
    scanner = new Scanner(System.in);
  }

  public String get_name() {
    return name;
  }

  public String get_word_from_user() {
    System.out.println(name + ">>");
    word = scanner.nextLine();
    return word;
  }

  public boolean check_success(String last_word) {
    int last_index = last_word.length() - 1;
    if (last_word.charAt(last_index) == word.charAt(0)) {
      return true;
    }
    return false;
  }

}
