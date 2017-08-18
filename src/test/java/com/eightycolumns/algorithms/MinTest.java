package com.eightycolumns.algorithms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinTest {
  @Test
  public void whenPassedOneIntMinReturnsThatInt() {
    assertEquals(2, Min.of(2));
  }

  @Test
  public void minFindsSmallerOfTwoInts() {
    assertEquals(2, Min.of(2, 3));
  }

  @Test
  public void minFindsSmallestOfThreeInts() {
    assertEquals(2, Min.of(2, 3, 4));
  }

  @Test
  public void minFindsSmallestIntInArray() {
    int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    assertEquals(0, Min.in(array));
  }
}
