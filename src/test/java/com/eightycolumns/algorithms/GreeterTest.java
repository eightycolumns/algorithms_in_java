package com.eightycolumns.algorithms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreeterTest {
  @Test
  public void greeterGreets() {
    assertEquals("Hello, World.", Greeter.greet());
  }
}
