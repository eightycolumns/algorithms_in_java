package com.eightycolumns.algorithms;

public class Fibonacci {
  public static int number(int d) {
    return (d < 2) ? d : number(d - 1) + number(d - 2);
  }
}
