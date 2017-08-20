package com.eightycolumns.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {
  int[] evenLengthArray;
  int[] oddLengthArray;

  @Before
  public void setUp() {
    evenLengthArray = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    oddLengthArray = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
  }

  @Test
  public void iterativeBinarySearchFindsKeyZeroAtIndexZeroInEvenLengthArray() {
    assertEquals(0, BinarySearch.iterative(0, evenLengthArray));
  }

  @Test
  public void iterativeBinarySearchFindsKeyFourAtIndexFourInEvenLengthArray() {
    assertEquals(4, BinarySearch.iterative(4, evenLengthArray));
  }

  @Test
  public void iterativeBinarySearchFindsKeyFiveAtIndexFiveInEvenLengthArray() {
    assertEquals(5, BinarySearch.iterative(5, evenLengthArray));
  }

  @Test
  public void iterativeBinarySearchFindsKeyNineAtIndexNineInEvenLengthArray() {
    assertEquals(9, BinarySearch.iterative(9, evenLengthArray));
  }

  @Test
  public void iterativeBinarySearchCannotFindKeyTenInEvenLengthArray() {
    assertEquals(-1, BinarySearch.iterative(10, evenLengthArray));
  }

  @Test
  public void iterativeBinarySearchFindsKeyOneAtIndexZeroInOddLengthArray() {
    assertEquals(0, BinarySearch.iterative(1, oddLengthArray));
  }

  @Test
  public void iterativeBinarySearchFindsKeyFiveAtIndexFourInOddLengthArray() {
    assertEquals(4, BinarySearch.iterative(5, oddLengthArray));
  }

  @Test
  public void iterativeBinarySearchFindsKeyNineAtIndexEightInOddLengthArray() {
    assertEquals(8, BinarySearch.iterative(9, oddLengthArray));
  }

  @Test
  public void iterativeBinarySearchCannotFindKeyTenInOddLengthArray() {
    assertEquals(-1, BinarySearch.iterative(10, oddLengthArray));
  }

  @Test
  public void recursiveBinarySearchFindsKeyZeroAtIndexZeroInEvenLengthArray() {
    assertEquals(0, BinarySearch.recursive(0, evenLengthArray));
  }

  @Test
  public void recursiveBinarySearchFindsKeyFourAtIndexFourInEvenLengthArray() {
    assertEquals(4, BinarySearch.recursive(4, evenLengthArray));
  }

  @Test
  public void recursiveBinarySearchFindsKeyFiveAtIndexFiveInEvenLengthArray() {
    assertEquals(5, BinarySearch.recursive(5, evenLengthArray));
  }

  @Test
  public void recursiveBinarySearchFindsKeyNineAtIndexNineInEvenLengthArray() {
    assertEquals(9, BinarySearch.recursive(9, evenLengthArray));
  }

  @Test
  public void recursiveBinarySearchCannotFindKeyTenInEvenLengthArray() {
    assertEquals(-1, BinarySearch.recursive(10, evenLengthArray));
  }

  @Test
  public void recursiveBinarySearchFindsKeyOneAtIndexZeroInOddLengthArray() {
    assertEquals(0, BinarySearch.recursive(1, oddLengthArray));
  }

  @Test
  public void recursiveBinarySearchFindsKeyFiveAtIndexFourInOddLengthArray() {
    assertEquals(4, BinarySearch.recursive(5, oddLengthArray));
  }

  @Test
  public void recursiveBinarySearchFindsKeyNineAtIndexEightInOddLengthArray() {
    assertEquals(8, BinarySearch.recursive(9, oddLengthArray));
  }

  @Test
  public void recursiveBinarySearchCannotFindKeyTenInOddLengthArray() {
    assertEquals(-1, BinarySearch.recursive(10, oddLengthArray));
  }
}
