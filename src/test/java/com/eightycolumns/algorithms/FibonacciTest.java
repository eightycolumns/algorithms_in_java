package com.eightycolumns.algorithms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {
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
