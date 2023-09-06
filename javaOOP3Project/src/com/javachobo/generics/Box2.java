package com.javachobo.generics;

public class Box2<T> { // 제네릭에서 불가한 예시

  // static 한 변수는 제네릭 적용이 불가하다.
  // static T item;
  //
  // static int compare(T x, T y) { // 클래스 메소드의 매개변수는 제네릭 적용이 불가하다.
  // // ...
  // }

  // T[] arr = new t[3]; // 배열 생성 시 제네릭 적용이 불가하다.


  // 와일드 카드
  // <? extends T> // 상한 제한 (T를 기준으로 자신을 포함한 자식 타입까지만 받겠다.)
  // <? super T> // 하한 제한
  // <?> // object

  // 클래스의 제네릭 타입
  // 메소드의 제네릭 타입


}

// Box<Integer> box1 = new Box<>();
// Box<boolean> box2 = new Box<>();
//
// Box<Integer>.item
// Box<Boolean>.item

