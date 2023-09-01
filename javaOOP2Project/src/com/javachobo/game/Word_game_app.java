package com.javachobo.game;

import java.util.Scanner;

public class Word_game_app {

  private Scanner scanner;
  private String start_word = "�ƹ���";
  private Player[] players;

  public Word_game_app() {
    scanner = new Scanner(System.in);
  }

  private void create_players() {
    System.out.println("���ӿ� �����ϴ� �ο� �� �� �Է� ���ּ���.");
    int n_players = scanner.nextInt();
    players = new Player[n_players];

    for (int i = 0; i < players.length; i++) {
      System.out.println("�������� �̸��� �Է� �ϼ���.");
      String name = scanner.next();
      players[i] = new Player(name);
    }
  }

  public void run() {
    System.out.println("===========================");
    System.out.println("=======  �����ձ� ����   =======");
    System.out.println("===========================");

    create_players();

    String last_word = start_word;

    System.out.println("���� �ܾ� : " + last_word);

    int next = 0;

    while (true) {
      String new_word = players[next].get_word_from_user();

      if (!players[next].check_success(last_word)) {
        System.out.printf("%s ���� �й� �ϼ̽��ϴ�.\n", players[next].get_name());
        System.out.println("���� ����");
        break;
      }
      next++;
      next %= players.length;
      last_word = new_word;
    }
  }


}
