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

    String last_word = start_word;

    System.out.println("시작 단어 : " + last_word);

    int next = 0;

    while (true) {
      String new_word = players[next].get_word_from_user();

      if (!players[next].check_success(last_word)) {
        System.out.printf("%s 님이 패배 하셨습니다.\n", players[next].get_name());
        System.out.println("게임 종료");
        break;
      }
      next++;
      next %= players.length;
      last_word = new_word;
    }
  }


}
