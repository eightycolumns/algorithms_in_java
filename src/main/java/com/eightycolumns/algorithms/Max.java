package com.eightycolumns.algorithms;

public class Max {
  public static int in(int[] array) {
    int max = array[0];

    for (int i = 1; i < array.length; i += 1) {
      if (array[i] > max) {
        max = array[i];
      }
    }

    return max;
  }

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
