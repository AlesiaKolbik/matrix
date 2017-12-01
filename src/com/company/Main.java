package com.company;

public class Main {

    public static void main(String[] args) {
        int matrix[][] = new int[12][5];
        int matrix2[][] = {{1, 2, 5, 7, 6, 8, 9, 5, 7, 9, 23, 11, 6, 4}, {4, 26, 4, 7, 1, 2, 4, 5, 5, 5, 9, 6, 6, 6, 6}};
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                matrix[i][j] = 2;
            }
        }
        
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                System.out.println(matrix[i][j]);
            }

        }
    }
}
