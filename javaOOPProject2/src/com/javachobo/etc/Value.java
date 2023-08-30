package com.javachobo.etc;

import java.util.Objects;

public class Value {


  int value;

  public Value(int value) {
    super();
    this.value = value;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Value) {
      Value other = (Value) obj;
      return this.value == other.value;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(value); // (value + "").hashCode();
  }



}
