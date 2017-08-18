package com.eightycolumns.algorithms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxTest {
  @Test
  public void whenPassedOneIntMaxReturnsThatInt() {
    assertEquals(2, Max.of(2));
  }

  @Test
  public void maxFindsLargerOfTwoInts() {
    assertEquals(3, Max.of(2, 3));
  }

  @Test
  public void maxFindsLargestOfThreeInts() {
    assertEquals(4, Max.of(2, 3, 4));
  }

  @Test
  public void maxFindsLargestIntInArray() {
    int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    assertEquals(9, Max.in(array));
  }
}
