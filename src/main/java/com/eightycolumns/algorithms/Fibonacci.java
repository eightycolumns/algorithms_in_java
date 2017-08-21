package com.eightycolumns.algorithms;

import java.math.BigInteger;
import java.util.HashMap;

public class Fibonacci {
  private static HashMap<Integer, BigInteger> cache;

  static {
    cache = new HashMap<>();
  }

  public static BigInteger number(int d) {
    if (d < 0) {
      throw new IllegalArgumentException(
        "Fibonacci.number() expects non-negative integer"
      );
    }

    if (d < 2) {
      return BigInteger.valueOf(d);
    }

    if (cache.containsKey(d)) {
      return cache.get(d);
    }

    BigInteger result = number(d - 1).add(number(d - 2));

    cache.put(d, result);

    return result;
  }
}
