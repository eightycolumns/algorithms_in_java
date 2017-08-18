package com.eightycolumns.algorithms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinTest {
  @Test
  public void minFindsSmallerOfTwoInts() {
    assertEquals(2, Min.of(2, 3));
  }
}
