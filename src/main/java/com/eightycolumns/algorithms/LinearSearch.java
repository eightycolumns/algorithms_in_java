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

  public static int recursive(int d, int[] a) {
    return recursiveLinearSearch(d, a, 0, a.length);
  }

  private static int recursiveLinearSearch(int d, int[] a, int i, int n) {
    if (i == n) {
      return -1;
    }

    if (d != a[i]) {
      return recursiveLinearSearch(d, a, i + 1, n);
    } else {
      return i;
    }
  }
}
