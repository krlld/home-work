package lesson5.task3;

import java.util.Scanner;

public class Main {
    //    Задача *:
    //    Даны числа n и m. Создайте массив A[n][m] и заполните его змейкой (см. пример).
    //    Формат входных данных:
    //    Программа получает на вход два числа n и m.
    //    Формат выходных данных:
    //    Программа должна вывести полученный массив, отводя на вывод каждого числа ровно 3
    //    символа.
    public static void main(String[] args) {
        int n = inputInt("Enter n: ");
        int m = inputInt("Enter m: ");
        int[][] arr = new int[n][m];
        initSnakeArray(arr);
        printArray(arr);
    }

    public static void initSnakeArray(int[][] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i % 2 == 0) {
                    arr[i][j] = count;
                } else {
                    arr[i][arr[i].length - j - 1] = count;
                }
                count++;
            }
        }
    }

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%-3d", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static int inputInt(String message) {
        int number;
        while (true) {
            try {
                System.out.print(message);
                Scanner scanner = new Scanner(System.in);
                if (scanner.hasNextInt()) {
                    number = scanner.nextInt();
                } else {
                    throw new RuntimeException("Incorrect input");
                }
                return number;
            } catch (RuntimeException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }
}
