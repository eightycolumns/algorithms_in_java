package com.eightycolumns.algorithms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeastCommonMultipleTest {
  @Test
  public void lcmOf15And35Is105() {
    assertEquals(105, LeastCommonMultiple.of( 15,  35));
    assertEquals(105, LeastCommonMultiple.of(-15,  35));
    assertEquals(105, LeastCommonMultiple.of( 15, -35));
    assertEquals(105, LeastCommonMultiple.of(-15, -35));
  }

  @Test
  public void lcmOf35And77Is385() {
    assertEquals(385, LeastCommonMultiple.of( 35,  77));
    assertEquals(385, LeastCommonMultiple.of(-35,  77));
    assertEquals(385, LeastCommonMultiple.of( 35, -77));
    assertEquals(385, LeastCommonMultiple.of(-35, -77));
  }
}
