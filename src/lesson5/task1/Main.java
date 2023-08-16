package lesson5.task1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    //    Задача 1:
    //    1.1 Создать двумерный массив, заполнить его случайными числами.
    //    1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли.
    //    1.3 Найти сумму всех получившихся элементов и вывести в консоль.
    public static void main(String[] args) {
        int[][] arr = generateArrayRandomValues(4, 5, 100);
        System.out.println(Arrays.deepToString(arr));

        int number = inputInt();
        addNumber(arr, number);
        System.out.println(Arrays.deepToString(arr));

        int sum = countSum(arr);
        System.out.println("Sum: " + sum);
    }

    public static int[][] generateArrayRandomValues(int firstSize, int secondSize, int bound) {
        int[][] arr = new int[firstSize][secondSize];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(bound);
            }
        }

        return arr;
    }

    public static void addNumber(int[][] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] += number;
            }
        }
    }

    public static int countSum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    public static int inputInt() {
        int number;
        while (true) {
            try {
                System.out.print("Enter number: ");
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

