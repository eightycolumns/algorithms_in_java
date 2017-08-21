package com.eightycolumns.algorithms;

public class Fibonacci {
  public static int number(int d) {
    if (d < 0) {
      throw new IllegalArgumentException(
        "Fibonacci.number() expects non-negative integer"
      );
    }

    return (d < 2) ? d : number(d - 1) + number(d - 2);
  }
}
