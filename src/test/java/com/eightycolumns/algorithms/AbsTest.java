package com.eightycolumns.algorithms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AbsTest {
  @Test
  public void absoluteValueOfNegativeOneIsPositiveOne() {
    assertEquals(1, Abs.of(-1));
  }
}
