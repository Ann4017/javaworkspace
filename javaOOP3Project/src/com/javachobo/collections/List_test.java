package com.javachobo.collections;

public class List_test { // 공간적 이점을 가져간다. 중복 허용

  public static void main(String[] args) {

    // 값을 추가 할 때는 add

    // ArrayList list = new ArrayList<>(); // 타입이 object 타입 이므로 캐스팅이 이루어진다.
    // list.add(new Integer(1)); // int형을 그대로 넣지 못하기 때문에 참조형으로 랩핑 하여 넣어준다.
    // list.add(new Integer(5));
    // list.add(new Integer(3));
    // list.add(new Integer(2));
    // list.add(new Integer(4));


    // 가져올 때는 get

    // Integer it = (Integer) list.get(0); //object 타입으로 캐스팅이 이루어진 후라 다시 integer 타입으로 캐스팅 해준다.
    // int i = (Integer) list.get(0); // Auto 박싱
    // System.out.println(i);


    // for (int i = 0; i < list.size(); i++) { // 일반적인 for 문 사용, 값이 들어있는 만큼을 나타내야 하기 때문에 length 가 이닌
    // // size로 확인 을 해야한다. 값이 들어가 있지않은 곳은 반복하지 않는다.
    // int it = (Integer) list.get(i);
    // System.out.println(it);
    // }
    //
    // System.out.println("-------------------");
    //
    // for (Object obj : list) { // 향상 된 for 문 사용
    // int it = (Integer) obj;
    // System.out.println(it);
    // }
    //
    // list.remove(2); // 삭제
    //
    // System.out.println("-------------------");
    //
    // for (Object obj : list) {
    // int it = (Integer) obj;
    // System.out.println(it);
    // }



    // LinkedList
    // node 개념 list
    // 사용법은 ArrayList 와 같다.

    // LinkedList list = new LinkedList<>();
    //
    // list.add(new Integer(1));
    // list.add(new Integer(5));
    // list.add(new Integer(3));
    // list.add(new Integer(2));
    // list.add(new Integer(4));


    // Stack 구조 (입출구 1개)
    // LIFO

    // Stack st = new Stack<>();
    //
    // st.push("1"); // new String("1")
    // st.push("2"); // 스택 구조로 데이터 넣기
    // st.push("3");

    // st.pop(); // 스택 구조로 데이터 지우기
    //
    // st.peek(); // 스택 구조로 읽어오는 방식

    // System.out.println(st.peek());
    // System.out.println(st.peek());
    // System.out.println(st.peek());
    //
    // System.out.println("-------------");

    // System.out.println(st.pop());
    // System.out.println(st.pop());
    // System.out.println(st.pop());

    // while (!st.isEmpty()) { // isEmpty : 배열 속 null 이 아닌 값만 불러오고 null 값은 true를 반환한다. 값이 있으면 false
    // 반환
    // System.out.println(st.pop());
    // }
    //
    // System.out.println("--------------");


    // Queue 구조 (입출구 2개) 순서대로 처리해야 할 때
    // FIFO

    // Queue q = new LinkedList();
    //
    // q.offer("1"); // 넣기
    // q.offer("2");
    // q.offer("3");
    // q.offer("4");
    //
    // while (!q.isEmpty()) {
    // System.out.println(q.poll());
    // }



    // 데이터 값 읽기 의 표준화
    // Iterator
    // hasNext(), next(), remove()

    // Iterator it;

    // ArrayList list = new ArrayList();
    //
    // list.add("1");
    // list.add("2");
    // list.add("3");
    //
    // Iterator it = list.iterator(); // colection 에 상속 된 클래스은 모두 사용 가능
    //
    // while (it.hasNext()) { // isEmpty 와 반대 값을 반환
    // String str = (String) it.next(); // object 타입 임으로 캐스팅 후 출력
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
