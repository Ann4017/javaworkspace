package com.javachobo.exception;

public class Exception_test {

  public static void main(String[] args) {

    // // 예외처리
    // // 해결 가능한 코드를 처리 하는것
    // try {
    // // 문제의 소지가 있는 실행문
    // } catch (Exception e) { // 클래스명 변수명
    // // 예외 처리를 위한 실행문
    // } finally { // 예외 발생 유/무 와 상관없이 실행
    //
    // }

    int num = 100;
    int result = 0;
    int[] arr = {1, 2, 3};

    for (int i = 0; i < 10; i++) {
      try {
        result = num / (int) (Math.random() * 9);
        System.out.println(result);
        arr[0] = 10;

      } catch (IndexOutOfBoundsException e) {
        System.out.println(e.getMessage()); // err 메시지 확인
        System.out.println("index num err");
        e.printStackTrace(); // err 위치 추적 메시지

      } catch (Exception e) { // 모든 예외처리 인 Exception을 사용 할 경우 코드 맨 아래에 위치하게 둔다.
        System.out.println(e.getMessage());
        System.out.println("0 으로 나누기 불가능");
        e.printStackTrace();
      }

    }
  }
}
