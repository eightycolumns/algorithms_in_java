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

  @Test
  public void arrayWithOneElementIsReversedInPlace() {
    int[] array = {2};
    Reverse.inPlace(array);

    assertArrayEquals(new int[] {2}, array);
  }

  @Test
  public void emptyArrayIsReversedInPlace() {
    int[] array = {};
    Reverse.inPlace(array);

    assertArrayEquals(new int[] {}, array);
  }

  @Test
  public void copyOfArrayWithTenElementsIsReversed() {
    int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    int[] reversedCopy = Reverse.copyOf(array);

    assertArrayEquals(new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, reversedCopy);
    assertArrayEquals(new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, array);
  }
}
