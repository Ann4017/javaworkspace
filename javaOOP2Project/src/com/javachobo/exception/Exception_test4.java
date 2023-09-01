package com.javachobo.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception_test4 {

  public static void main(String[] args) throws IOException {

    // FileInputStream fis = null;
    //
    // try {
    // fis = new FileInputStream("source.data");
    // } catch (FileNotFoundException e) {
    // // TODO Auto-generated catch block
    // e.printStackTrace();
    // } finally {
    // try {
    // fis.close();
    // } catch (IOException e) {S
    // // TODO Auto-generated catch block
    // e.printStackTrace();
    // }
    // }


    try (FileInputStream fis = new FileInputStream("source.data");) {

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

}
