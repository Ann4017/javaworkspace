package com.javachobo.collections;

public class List_test { // ������ ������ ��������. �ߺ� ���

  public static void main(String[] args) {

    // ���� �߰� �� ���� add

    // ArrayList list = new ArrayList<>(); // Ÿ���� object Ÿ�� �̹Ƿ� ĳ������ �̷������.
    // list.add(new Integer(1)); // int���� �״�� ���� ���ϱ� ������ ���������� ���� �Ͽ� �־��ش�.
    // list.add(new Integer(5));
    // list.add(new Integer(3));
    // list.add(new Integer(2));
    // list.add(new Integer(4));


    // ������ ���� get

    // Integer it = (Integer) list.get(0); //object Ÿ������ ĳ������ �̷���� �Ķ� �ٽ� integer Ÿ������ ĳ���� ���ش�.
    // int i = (Integer) list.get(0); // Auto �ڽ�
    // System.out.println(i);


    // for (int i = 0; i < list.size(); i++) { // �Ϲ����� for �� ���, ���� ����ִ� ��ŭ�� ��Ÿ���� �ϱ� ������ length �� �̴�
    // // size�� Ȯ�� �� �ؾ��Ѵ�. ���� �� �������� ���� �ݺ����� �ʴ´�.
    // int it = (Integer) list.get(i);
    // System.out.println(it);
    // }
    //
    // System.out.println("-------------------");
    //
    // for (Object obj : list) { // ��� �� for �� ���
    // int it = (Integer) obj;
    // System.out.println(it);
    // }
    //
    // list.remove(2); // ����
    //
    // System.out.println("-------------------");
    //
    // for (Object obj : list) {
    // int it = (Integer) obj;
    // System.out.println(it);
    // }



    // LinkedList
    // node ���� list
    // ������ ArrayList �� ����.

    // LinkedList list = new LinkedList<>();
    //
    // list.add(new Integer(1));
    // list.add(new Integer(5));
    // list.add(new Integer(3));
    // list.add(new Integer(2));
    // list.add(new Integer(4));


    // Stack ���� (���ⱸ 1��)
    // LIFO

    // Stack st = new Stack<>();
    //
    // st.push("1"); // new String("1")
    // st.push("2"); // ���� ������ ������ �ֱ�
    // st.push("3");

    // st.pop(); // ���� ������ ������ �����
    //
    // st.peek(); // ���� ������ �о���� ���

    // System.out.println(st.peek());
    // System.out.println(st.peek());
    // System.out.println(st.peek());
    //
    // System.out.println("-------------");

    // System.out.println(st.pop());
    // System.out.println(st.pop());
    // System.out.println(st.pop());

    // while (!st.isEmpty()) { // isEmpty : �迭 �� null �� �ƴ� ���� �ҷ����� null ���� true�� ��ȯ�Ѵ�. ���� ������ false
    // ��ȯ
    // System.out.println(st.pop());
    // }
    //
    // System.out.println("--------------");


    // Queue ���� (���ⱸ 2��) ������� ó���ؾ� �� ��
    // FIFO

    // Queue q = new LinkedList();
    //
    // q.offer("1"); // �ֱ�
    // q.offer("2");
    // q.offer("3");
    // q.offer("4");
    //
    // while (!q.isEmpty()) {
    // System.out.println(q.poll());
    // }



    // ������ �� �б� �� ǥ��ȭ
    // Iterator
    // hasNext(), next(), remove()

    // Iterator it;

    // ArrayList list = new ArrayList();
    //
    // list.add("1");
    // list.add("2");
    // list.add("3");
    //
    // Iterator it = list.iterator(); // colection �� ��� �� Ŭ������ ��� ��� ����
    //
    // while (it.hasNext()) { // isEmpty �� �ݴ� ���� ��ȯ
    // String str = (String) it.next(); // object Ÿ�� ������ ĳ���� �� ���
    // System.out.println(str);
    // }
    //
    // System.out.println("---");
    //
    // for (Object obj : list) {
    // String str = (String) obj;
    // System.out.println(str);
    // }



  }
}
