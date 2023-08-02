package lesson2.task1;

import java.util.Scanner;

public class Main {
    //    Задача 1:
    //    Напишите программу, которая будет принимать на вход число из консоли и на выход
    //    будет выводить сообщение четное число или нет. Для определения четности числа
    //    используйте операцию получения остатка от деления (операция выглядит так: '% 2').
    public static void main(String[] args) {
        System.out.print("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}
