package com.eightycolumns.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinearSearchTest {
  int[] array;

  @Before
  public void setUp() {
    array = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
  }

  @Test
  public void iterativeLinearSearchFindsKeyZeroAtIndexZeroInArray() {
    assertEquals(0, LinearSearch.iterative(0, array));
  }

  @Test
  public void iterativeLinearSearchFindsKeyFourAtIndexFourInArray() {
    assertEquals(4, LinearSearch.iterative(4, array));
  }

  @Test
  public void iterativeLinearSearchFindsKeyFiveAtIndexFiveInArray() {
    assertEquals(5, LinearSearch.iterative(5, array));
  }

  @Test
  public void iterativeLinearSearchFindsKeyNineAtIndexNineInArray() {
    assertEquals(9, LinearSearch.iterative(9, array));
  }

  @Test
  public void iterativeLinearSearchCannotFindKeyTenInArray() {
    assertEquals(-1, LinearSearch.iterative(10, array));
  }
}

