package com.eightycolumns.algorithms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AbsTest {
  @Test
  public void absoluteValueOfNegativeOneIsPositiveOne() {
    assertEquals(1, Abs.of(-1));
  }

  @Test
  public void absoluteValueOfZeroIsZero() {
    assertEquals(0, Abs.of(0));
  }

  @Test
  public void absoluteValueOfPositiveOneIsPositiveOne() {
    assertEquals(1, Abs.of(1));
  }
}
