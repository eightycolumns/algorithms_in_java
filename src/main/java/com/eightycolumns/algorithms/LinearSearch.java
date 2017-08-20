package com.eightycolumns.algorithms;

public class LinearSearch {
  public static int iterative(int d, int[] a) {
    int n = a.length;

    for (int i = 0; i < n; i += 1) {
      if (d == a[i]) {
        return i;
      }
    }

    return -1;
  }
}
