package com.eightycolumns.algorithms;

public class BinarySearch {
  public static int iterative(int d, int[] a) {
    int low = 0;
    int high = a.length - 1;

    while (low <= high) {
      int mid = (low + high) / 2;

      if (d < a[mid]) {
        high = mid - 1;
      } else if (d > a[mid]) {
        low = mid + 1;
      } else {
        return mid;
      }
    }

    return -1;
  }
}
