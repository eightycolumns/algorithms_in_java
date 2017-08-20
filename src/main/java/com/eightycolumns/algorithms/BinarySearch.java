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

  public static int recursive(int d, int[] a) {
    return recursiveBinarySearch(d, a, 0, a.length - 1);
  }

  private static int recursiveBinarySearch(int d, int[] a, int low, int high) {
    if (low > high) {
      return -1;
    }

    int mid = (low + high) / 2;

    if (d < a[mid]) {
      return recursiveBinarySearch(d, a, low, mid - 1);
    } else if (d > a[mid]) {
      return recursiveBinarySearch(d, a, mid + 1, high);
    } else {
      return mid;
    }
  }
}
