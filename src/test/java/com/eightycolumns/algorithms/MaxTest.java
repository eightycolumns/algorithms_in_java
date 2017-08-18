package com.eightycolumns.algorithms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxTest {
  @Test
  public void maxFindsLargerOfTwoInts() {
    assertEquals(3, Max.of(2, 3));
  }

  @Test
  public void maxFindsLargestOfThreeInts() {
    assertEquals(4, Max.of(2, 3, 4));
  }
}
