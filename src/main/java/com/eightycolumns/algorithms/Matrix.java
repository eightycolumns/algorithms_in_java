package com.eightycolumns.algorithms;

public class Matrix {
  private final int[][] matrix;

  private final int rows;
  private final int cols;

  public Matrix(int[][] matrix) {
    for (int i = 1; i < matrix.length; i += 1) {
      if (matrix[0].length != matrix[i].length) {
        throw new IllegalArgumentException(
          "Matrix constructor expects equal-length rows"
        );
      }
    }

    rows = matrix.length;
    cols = matrix[0].length;

    this.matrix = new int[rows][cols];

    for (int i = 0; i < rows; i += 1) {
      for (int j = 0; j < cols; j += 1) {
        this.matrix[i][j] = matrix[i][j];
      }
    }
  }

  public boolean equals(Matrix matrix) {
    if (this.rows != matrix.rows || this.cols != matrix.cols) {
      return false;
    }

    for (int i = 0; i < matrix.rows; i += 1) {
      for (int j = 0; j < matrix.cols; j += 1) {
        if (this.element(i, j) != matrix.element(i, j)) {
          return false;
        }
      }
    }

    return true;
  }

  public Matrix times(Matrix matrix) {
    int[][] dotProduct = new int[this.rows][matrix.cols];

    for (int i = 0; i < this.rows; i += 1) {
      for (int j = 0; j < matrix.cols; j += 1) {
        for (int k = 0; k < this.cols; k += 1) {
          dotProduct[i][j] += this.element(i, k) * matrix.element(k, j);
        }
      }
    }

    return new Matrix(dotProduct);
  }

  private int element(int row, int col) {
    return matrix[row][col];
  }
}
