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
  }


}
