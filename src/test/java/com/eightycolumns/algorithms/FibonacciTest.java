package com.eightycolumns.algorithms;

import java.math.BigInteger;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertTrue;

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
    assertTrue(new BigInteger("0").equals(Fibonacci.number(0)));
  }

  @Test
  public void fibonacciNumberOneIsOne() {
    assertTrue(new BigInteger("1").equals(Fibonacci.number(1)));
  }

  @Test
  public void fibonacciNumber9Is34() {
    assertTrue(new BigInteger("34").equals(Fibonacci.number(9)));
  }

  @Test
  public void fibonacciNumber99Is218922995834555169026() {
    BigInteger expected = new BigInteger("218922995834555169026");
    BigInteger actual = Fibonacci.number(99);
    assertTrue(expected.equals(actual));
  }
}
