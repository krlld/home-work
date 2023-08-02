package lesson2.task5;

import java.util.Scanner;

public class Main {
    //    Задача *:
    //    Напишите программу, где пользователь вводит любое целое положительное число. А
    //    программа суммирует все числа от 1 до введенного пользователем числа. Для ввода
    //    числа воспользуйтесь классом Scanner. Сделать проверку, чтобы пользователь не мог
    //    ввести некорректные данные.
    public static void main(String[] args) {
        int number = 0;
        while (true) {
            try {
                System.out.print("Enter number greater than 0: ");
                number = enterInt();
                if (number < 1) {
                    throw new RuntimeException("Number lower than 1");
                }
                break;
            } catch (RuntimeException exception) {
                System.out.println(exception.getMessage());
            }
        }
        int sum = 0;
        for (int i = 1; i <= number; ++i) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }

    public static int enterInt() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            throw new RuntimeException("Incorrect input");
        }
    }
}
