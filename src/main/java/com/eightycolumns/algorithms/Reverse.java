package com.eightycolumns.algorithms;

public class Reverse {
  public static int[] inPlace(int[] array) {
    int i = 0;
    int j = array.length - 1;

    while (i < j) {
      int temp = array[i];
      array[i] = array[j];
      array[j] = temp;

      i += 1;
      j -= 1;
    }

    return array;
  }
}
