package com.javachobo.abstracts;

public abstract class Player {

  // ���� �Ұ�
  // ��Ӹ� ����
  // �߻� �޼ҵ尡 �����Ѵ�. (���� �� �� �����Ѵ�. ���� ��x) abstract ����Ÿ�� �޼ҵ��();
  // �ڽ� Ŭ�������� �ݵ�� �������̵� �ؾ��Ѵ�.
  int x;
  int y;


  abstract void play(int pos);

  abstract void stop();

}
