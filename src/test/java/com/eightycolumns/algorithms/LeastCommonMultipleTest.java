package com.eightycolumns.algorithms;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class LeastCommonMultipleTest {
  @Rule
  public ExpectedException exception = ExpectedException.none();

  @Test
  public void integersMustBeNonZero() {
    exception.expect(IllegalArgumentException.class);

    exception.expectMessage(
      "LeastCommonMultiple.of() expects non-zero integers"
    );

    LeastCommonMultiple.of(0, 1);
  }

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
