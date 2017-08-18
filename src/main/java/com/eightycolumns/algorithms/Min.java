package com.eightycolumns.algorithms;

public class Min {
  public static int in(int[] array) {
    int min = array[0];

    for (int i = 1; i < array.length; i += 1) {
      if (array[i] < min) {
        min = array[i];
      }
    }

    return min;
  }

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
