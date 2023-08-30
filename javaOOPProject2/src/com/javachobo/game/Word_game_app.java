package com.javachobo.game;

import java.util.Scanner;

public class Word_game_app {

  private Scanner scanner;
  private String start_word = "아버지";
  private Player[] players;

  public Word_game_app() {
    scanner = new Scanner(System.in);
  }

  private void create_players() {
    System.out.println("게임에 참가하는 인원 수 를 입력 해주세요.");
    int n_players = scanner.nextInt();
    players = new Player[n_players];

    for (int i = 0; i < players.length; i++) {
      System.out.println("참가자의 이름을 입력 하세요.");
      String name = scanner.next();
      players[i] = new Player(name);
    }
  }

  public void run() {
    System.out.println("===========================");
    System.out.println("=======  끝말잇기 게임   =======");
    System.out.println("===========================");

    create_players();
  }


}
