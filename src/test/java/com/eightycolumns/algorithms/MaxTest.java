package com.eightycolumns.algorithms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxTest {
  @Test
  public void maxFindsLargerOfTwoInts() {
    assertEquals(3, Max.of(2, 3));
  }
}
