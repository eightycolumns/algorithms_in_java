package com.eightycolumns.algorithms;

public class GreatestCommonDivisor {
  public static int of(int a, int b) {
    int min = Math.min(a, b);
    int max = Math.max(a, b);

    if (min == 0) {
      return max;
    }

    return GreatestCommonDivisor.of(min, max % min);
  }
}
