package by.adamovichhh.laba.task6;

public class Matrix {

    private void CreateMatrix(int[] digits) {
        int size = digits.length;
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = digits[(i + j) % size];
                System.out.printf("%5d",matrix[i][j]);
            }
            System.out.println();
        }
    }

    public void functionOutput() {
        int n = 20;
        int[] digits = new int[n];
        for (int i = 0; i < n; i++) { digits[i] = i; }
        CreateMatrix(digits);
    }
}
