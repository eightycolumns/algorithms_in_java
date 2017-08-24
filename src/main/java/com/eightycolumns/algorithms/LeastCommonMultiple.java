package com.eightycolumns.algorithms;

public class LeastCommonMultiple {
  public static int of(int a, int b) {
    if (a == 0 || b == 0) {
      throw new IllegalArgumentException(
        "LeastCommonMultiple.of() expects non-zero integers"
      );
    }

    return Math.abs(a * b / GreatestCommonDivisor.of(a, b));
  }
}
