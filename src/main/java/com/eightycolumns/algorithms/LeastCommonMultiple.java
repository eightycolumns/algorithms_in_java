package com.eightycolumns.algorithms;

public class LeastCommonMultiple {
  public static int of(int a, int b) {
    return Math.abs(a * b / GreatestCommonDivisor.of(a, b));
  }
}
