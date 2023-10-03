package lesson17.task1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//  Задача 1:
//  Вывести в консоль из строки которую пользователь вводит с клавиатуры все
//  аббревиатуры. Аббревиатурой будем считать слово от 2 до 6 символов, состоящее
//  только из прописных букв, без чисел.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("\\b[A-Z]{2,6}\\b");
        while (true) {
            System.out.println("Input string: ");
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            System.out.println("Result: ");
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }
    }
}
