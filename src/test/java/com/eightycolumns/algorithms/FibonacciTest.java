package com.eightycolumns.algorithms;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {
  @Rule
  public ExpectedException exception = ExpectedException.none();

  @Test
  public void fibonacciNumberExpectsNonNegativeInteger() {
    exception.expect(IllegalArgumentException.class);
    exception.expectMessage("Fibonacci.number() expects non-negative integer");
    Fibonacci.number(-1);
  }

  @Test
  public void fibonacciNumberZeroIsZero() {
    assertEquals(0, Fibonacci.number(0));
  }

  @Test
  public void fibonacciNumberOneIsOne() {
    assertEquals(1, Fibonacci.number(1));
  }

  @Test
  public void fibonacciNumberNineIsThirtyFour() {
    assertEquals(34, Fibonacci.number(9));
  }
}
