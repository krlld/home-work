package lesson4.utils;

import java.util.Random;
import java.util.Scanner;

public class Utils {
    private static int[] initArrayRandomValues(int size) {
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = random.nextInt(100);
        }
        return arr;
    }

    private static int inputInt() {
        int number = 0;
        while (true) {
            try {
                System.out.print("Enter number greater than 0: ");
                Scanner scanner = new Scanner(System.in);
                if (scanner.hasNextInt()) {
                    number = scanner.nextInt();
                } else {
                    throw new RuntimeException("Incorrect input");
                }
                if (number < 1) {
                    throw new RuntimeException("Number lower than 1");
                }
                return number;
            } catch (RuntimeException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }

    public static int[] createArray() {
        int size = inputInt();
        return initArrayRandomValues(size);
    }
}

