package lesson13.task1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//  Задача 1:
//  Пользователь вводит набор чисел в виде одной строки с клавиатуры. Например: "1, 2, 3,
//  4, 4, 5". Избавиться от повторяющихся элементов в строке. Вывести результат на экран.
//  При решении использовать коллекции.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        String input = scanner.nextLine();

        String [] numbers = input.split(" ");
        Set<String> set = new HashSet<>(Arrays.asList(numbers));
        System.out.println(set);
    }
}
