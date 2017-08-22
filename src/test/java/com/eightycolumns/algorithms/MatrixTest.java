package com.eightycolumns.algorithms;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MatrixTest {
  @Test
  public void dotProductOfTwoMatricesIsCorrectlyCalculated() {
    Matrix a = new Matrix(new int[][] {
      {0, 2, 4, 6},
      {2, 4, 6, 8}
    });

    Matrix b = new Matrix(new int[][] {
      {1, 3},
      {3, 5},
      {5, 7},
      {7, 9}
    });

    Matrix aTimesB = new Matrix(new int[][] {
      { 68,  92},
      {100, 140}
    });

    assertTrue(aTimesB.equals(a.times(b)));

    Matrix wrongAnswer = new Matrix(new int[][] {
      {140, 100},
      { 92,  68}
    });

    assertFalse(wrongAnswer.equals(a.times(b)));
  }
}
