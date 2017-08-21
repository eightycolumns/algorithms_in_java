package com.eightycolumns.algorithms;

public class Reverse {
  public static int[] inPlace(int[] array) {
    int i = 0;
    int j = array.length - 1;

    while (i < j) {
      swap(i, j, array);

      i += 1;
      j -= 1;
    }

    return array;
  }

  public static int[] copyOf(int[] array) {
    return Reverse.inPlace(array.clone());
  }

  private static void swap(int i, int j, int[] a) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }
}
