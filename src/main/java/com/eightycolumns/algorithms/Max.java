package com.eightycolumns.algorithms;

public class Max {
  public static int of(int firstInt, int ... subsequentInts) {
    int max = firstInt;

    for (int i = 0; i < subsequentInts.length; i += 1) {
      if (subsequentInts[i] > max) {
        max = subsequentInts[i];
      }
    }

    return max;
  }
}
