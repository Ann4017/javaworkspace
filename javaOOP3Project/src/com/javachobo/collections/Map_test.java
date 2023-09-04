package com.javachobo.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Stack;
import java.util.TreeSet;

public class Map_test {

  public static void main(String[] args) {
    //
    // // HashMap
    //
    // HashMap map = new HashMap();
    //
    // // 데이터 넣기 (키/값) 키값 중복 x (중복 된다면 마지막 데이터를 넣는다.)
    //
    // map.put("myid", "1234");
    // map.put("asdf", "1111");
    // map.put("asdf", "1234");
    //
    // System.out.println(map);
    //
    // // 키값을 이용해 값을 가져오는 방식 (오브젝트 타입이기 때문에 형변환이 이루어져야한다.)
    // String value = (String) map.get("myid");
    // System.out.println(value);
    //
    // // 키값을 가져오는 방법
    // Iterator keys = map.keySet().iterator();
    // while (keys.hasNext()) {
    // String key = (String) keys.next();
    // System.out.println(key); // key 값
    // System.out.println(map.get(key)); // value 값
    // }
    //
    // // key, value 값을 가져오는 방법
    // Iterator entry_set = map.entrySet().iterator();
    // while (entry_set.hasNext()) {
    // Map.Entry entry = (Map.Entry) entry_set.next();
    // String key = (String) entry.getKey();
    // String valus = (String) entry.getValue();
    // System.out.println(key + " : " + value);
    // }
    //
    //
    // // TreeMap
    // // 기본적으로 key 값 기준 정렬
    // String[] data = {"A", "K", "A", "D", "A", "K", "K", "K", "Z", "D"};
    // TreeMap t_map = new TreeMap<>();
    //
    // for (int i = 0; i < data.length; i++) {
    // if (t_map.containsKey(data[i])) {
    // int value1 = (Integer) t_map.get(data[i]);
    // t_map.put(i, new Integer(value1 + 1));
    // } else {
    // t_map.put(data[i], new Integer(1));
    // }
    // }



    // // Properties
    // // file의 읽기, 쓰기
    //
    // Properties prop = new Properties();
    //
    // prop.setProperty("qwer", "1234");
    // prop.setProperty("asdf", "1111");
    // prop.setProperty("asdf", "1234");
    //
    // System.out.println(prop);
    //
    // // System.out.println(prop.getProperty("qwer"));
    //
    // Enumeration e = prop.propertyNames(); // key 값 전체 가져오기
    // while (e.hasMoreElements()) {
    // String element = (String) e.nextElement();
    // System.out.println(element + "=" + prop.getProperty(element)); // file 읽기, 쓰기의 양식
    // }
    //
    //

    // file 불러와서 읽기
    // Properties prop = new Properties();
    // try {
    // prop.load(new FileInputStream("input.txt")); // 파일을 불러올 때는 예외처리가 필요하다.
    // } catch (FileNotFoundException e) {
    // e.printStackTrace();
    // } catch (IOException e) {
    // e.printStackTrace();
    // }
    //
    // String name = prop.getProperty("name");
    // String[] data = prop.getProperty("data").split(",");
    //
    // int sum = 0;
    // for (String s : data) {
    // int num = Integer.parseInt(s);
    // sum += num;
    // }
    // double avg = sum / (double) (data.length);
    // System.out.println(name);
    // System.out.println(sum); // 총합
    // System.out.println(avg); // 합의 평균


    // file 쓰기
    // Properties prop = new Properties();
    //
    // prop.setProperty("name", "abh");
    // prop.setProperty("age", "10");
    //
    //
    // try {
    // prop.store(new FileOutputStream("output.txt"), "test properties"); // 저장하는 것도 예외처리 필수
    // } catch (FileNotFoundException e) {
    // // TODO Auto-generated catch block
    // e.printStackTrace();
    // } catch (IOException e) {
    // // TODO Auto-generated catch block
    // e.printStackTrace();
    // }


    ArrayList list = new ArrayList<>();
    list.add(3);
    list.add(6);
    list.add(2);
    list.add(2);
    list.add(2132);
    list.add(5213);
    list.add(7232);

    System.out.println(list);
    Collections.sort(list); // 정렬 후
    System.out.println(list);

    HashSet set = new HashSet(list); // list 을 set 에 대입하는 순간 중복 데이터가 사라진다.
    System.out.println(set);

    System.out.println("-----------------");
    list.addAll(set);
    System.out.println(list);
    System.out.println("-----------------");

    TreeSet t_set = new TreeSet(set);
    System.out.println(t_set);

    Stack stack = new Stack();
    stack.addAll(t_set);
    while (!stack.isEmpty()) {
      System.out.println(stack.pop());
    }


  }

}
