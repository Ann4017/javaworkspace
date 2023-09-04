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
    // // ������ �ֱ� (Ű/��) Ű�� �ߺ� x (�ߺ� �ȴٸ� ������ �����͸� �ִ´�.)
    //
    // map.put("myid", "1234");
    // map.put("asdf", "1111");
    // map.put("asdf", "1234");
    //
    // System.out.println(map);
    //
    // // Ű���� �̿��� ���� �������� ��� (������Ʈ Ÿ���̱� ������ ����ȯ�� �̷�������Ѵ�.)
    // String value = (String) map.get("myid");
    // System.out.println(value);
    //
    // // Ű���� �������� ���
    // Iterator keys = map.keySet().iterator();
    // while (keys.hasNext()) {
    // String key = (String) keys.next();
    // System.out.println(key); // key ��
    // System.out.println(map.get(key)); // value ��
    // }
    //
    // // key, value ���� �������� ���
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
    // // �⺻������ key �� ���� ����
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
    // // file�� �б�, ����
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
    // Enumeration e = prop.propertyNames(); // key �� ��ü ��������
    // while (e.hasMoreElements()) {
    // String element = (String) e.nextElement();
    // System.out.println(element + "=" + prop.getProperty(element)); // file �б�, ������ ���
    // }
    //
    //

    // file �ҷ��ͼ� �б�
    // Properties prop = new Properties();
    // try {
    // prop.load(new FileInputStream("input.txt")); // ������ �ҷ��� ���� ����ó���� �ʿ��ϴ�.
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
    // System.out.println(sum); // ����
    // System.out.println(avg); // ���� ���


    // file ����
    // Properties prop = new Properties();
    //
    // prop.setProperty("name", "abh");
    // prop.setProperty("age", "10");
    //
    //
    // try {
    // prop.store(new FileOutputStream("output.txt"), "test properties"); // �����ϴ� �͵� ����ó�� �ʼ�
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
    Collections.sort(list); // ���� ��
    System.out.println(list);

    HashSet set = new HashSet(list); // list �� set �� �����ϴ� ���� �ߺ� �����Ͱ� �������.
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
