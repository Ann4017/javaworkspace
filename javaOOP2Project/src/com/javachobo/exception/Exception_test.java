package com.javachobo.exception;

public class Exception_test {

  public static void main(String[] args) {

    // // ����ó��
    // // �ذ� ������ �ڵ带 ó�� �ϴ°�
    // try {
    // // ������ ������ �ִ� ���๮
    // } catch (Exception e) { // Ŭ������ ������
    // // ���� ó���� ���� ���๮
    // } finally { // ���� �߻� ��/�� �� ������� ����
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
        System.out.println(e.getMessage()); // err �޽��� Ȯ��
        System.out.println("index num err");
        e.printStackTrace(); // err ��ġ ���� �޽���

      } catch (Exception e) { // ��� ����ó�� �� Exception�� ��� �� ��� �ڵ� �� �Ʒ��� ��ġ�ϰ� �д�.
        System.out.println(e.getMessage());
        System.out.println("0 ���� ������ �Ұ���");
        e.printStackTrace();
      }

    }
  }
}
