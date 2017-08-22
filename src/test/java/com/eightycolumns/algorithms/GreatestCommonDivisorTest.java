package com.eightycolumns.algorithms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreatestCommonDivisorTest {
  @Test
  public void gcdOfZeroAndZeroIsZero() {
    assertEquals(0, GreatestCommonDivisor.of(0, 0));
  }

  @Test
  public void gcdOfZeroAndOneIsOne() {
    assertEquals(1, GreatestCommonDivisor.of(0, 1));
  }

  @Test
  public void gcdOf15And35Is5() {
    assertEquals(5, GreatestCommonDivisor.of(15, 35));
  }

  @Test
  public void gcdOf35And77Is7() {
    assertEquals(7, GreatestCommonDivisor.of(35, 77));
  }

}
