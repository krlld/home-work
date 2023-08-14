package lesson5.task4;

import java.util.Random;

public class Main {
    //    Задача 3:
    //    Найдите сумму элементов на главной и побочной диагонали:
    public static void main(String[] args) {
        final int n = 5;
        int[][] arr = generateSquareArrayRandomValues(n, 100);
        printArray(arr);
        System.out.println("Sum on main diagonal: " + countSumOnMainDiagonal(arr));
        System.out.println("Sum on side diagonal: " + countSumOnSideDiagonal(arr));
    }

    public static int countSumOnMainDiagonal(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        return sum;
    }

    public static int countSumOnSideDiagonal(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][arr.length - i - 1];
        }
        return sum;
    }

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%-3d", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] generateSquareArrayRandomValues(int n, int bound) {
        int[][] arr = new int[n][n];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(bound);
            }
        }

        return arr;
    }
}
