// package com.javachobo.lamda;
//
// public class Lamda_test1 {
//
// static void execute(My_func f) {
// f.run();
// }
//
// static My_func get_my_func() {
// My_func f = () -> System.out.println("f3.run()");
// return f;
// }
//
// public static void main(String[] args) {
//
// My_func f1 = () -> System.out.println("f1.run()");
//
// My_func f2 = new My_func() {
//
// @Override
// public void run() {
// System.out.println("f2.run()");
// }
// };
//
// My_func f3 = get_my_func();
//
// f1.run();
// f2.run();
// f3.run();
// System.out.println("=========");
// execute(f1);
// execute(f2);
// execute(f3);
// System.out.println("=========");
// execute(() -> System.out.println("new()"));
//
// }
//
// }
