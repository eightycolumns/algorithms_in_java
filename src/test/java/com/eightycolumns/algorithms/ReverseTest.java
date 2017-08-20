package com.eightycolumns.algorithms;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ReverseTest {
  @Test
  public void arrayWithTenElementsIsReversedInPlace() {
    int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    Reverse.inPlace(array);

    assertArrayEquals(new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, array);
  }
}
