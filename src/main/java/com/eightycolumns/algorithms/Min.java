package com.eightycolumns.algorithms;

public class Min {
  public static int of(int firstInt, int ... subsequentInts) {
    int min = firstInt;

    for (int i = 0; i < subsequentInts.length; i += 1) {
      if (subsequentInts[i] < min) {
        min = subsequentInts[i];
      }
    }

    return min;
  }
}
