package com.eightycolumns.algorithms;

public class LeastCommonMultiple {
  public static int of(int a, int b) {
    return a * b / GreatestCommonDivisor.of(a, b);
  }
}
