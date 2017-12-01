package com.company;

public class matrix {
    int matrix[][] = new int[12][5];


    public int getElement(int number, int number2) {    //возвращает нужный элемент из массива
        int element = matrix[number][number2];
        if (number > 11 && number2 > 4) {
            System.out.println("Вы вышли за пределы массива.");
        }
        return element;
    }

    public int sumElementsInColumn(int number) {  //возвращает сумму элементов с толбце
        int sumElements = 0;
        for (int i = 0; i < matrix[number].length - 1; i++) {
            sumElements += matrix[number][i];
        }
        return sumElements;
    }

    public int minElementMatrix() { //найти минимальный элемент в массиве
        int min = 0;
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                min = Math.min(matrix[i][j], matrix[i][j]);
            }
        }
        return min;
    }

    public int[][] sumMatrices(int[][] matrix2) { //сложение двух матриц
        int[][] matrix3 = new int[12][5];
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                matrix3[i][j] = matrix[i][j] + matrix2[i][j];
            }
        }
        return matrix3;
    }

    public int[][] subtraction(int[][] matrix2) { //вычитание матриц
        int[][] matrix3 = new int[12][5];
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                matrix3[i][j] = matrix[i][j] - matrix2[i][j];
            }
        }
        return matrix3;
    }

    public int[][] multiplication(int[][] matrix2) { //умножение матриц
        int[][] matrix3 = new int[12][5];
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                matrix3[i][j] = matrix[i][j] * matrix2[i][j];
            }
        }
        return matrix3;
    }

    public int[][] division(int[][] matrix2) { //деление матриц
        int[][] matrix3 = new int[12][5];
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                matrix3[i][j] = matrix[i][j] / matrix2[i][j];
            }
        }
        return matrix3;
    }

    public int[][] sumMatricesAndNumber(int number) { //сложение матрицы с числом
        int[][] matrix3 = new int[12][5];
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                matrix3[i][j] = matrix[i][j] + number;
            }
        }
        return matrix3;
    }

    public int[][] subtrMatricesAndNumber(int number) { //вычитание матрицы с числом
        int[][] matrix3 = new int[12][5];
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                matrix3[i][j] = matrix[i][j] - number;
            }
        }
        return matrix3;
    }

    public int[][] multiMatricesAndNumber(int number) { //умножение матрицы на число
        int[][] matrix3 = new int[12][5];
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                matrix3[i][j] = matrix[i][j] * number;
            }
        }
        return matrix3;
    }

    public int[][] divMatricesAndNumber(int number) { //деление матрицы на число
        int[][] matrix3 = new int[12][5];
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                matrix3[i][j] = matrix[i][j] / number;
            }
        }
        return matrix3;
    }
}

