package lesson10.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//  4. Дана строка произвольной длины с произвольными словами.
//  Написать программу для проверки является ли любое выбранное слово в
//  строке палиндромом. Например, есть строка, вводится число 3, значит необходимо проверить
//  является ли 3-е слово в этой строке палиндромом.
//  Предусмотреть предупреждающие сообщения на случаи ошибочных
//  ситуаций: например, в строке 5 слов, а на вход программе передали число
//  500 и т. п. ситуации.
public class Main {
    public static void main(String[] args) {
        String str = "f  rfefr fe f e  f     ferfe rf   efre  qw  q ";
        List<String> words = stringToListOfWords(str);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(str);
            System.out.print("Input index of word: ");
            int pos = scanner.nextInt() - 1;
            if (pos < 0 || pos > words.size() - 1) {
                System.out.println("Incorrect index");
                continue;
            }
            System.out.println("Palindrome: " + isPalindrome(str, pos));
        }
    }

    public static boolean isPalindrome(String str, int pos) {
        List<String> words = stringToListOfWords(str);
        String word = words.get(pos);
        StringBuilder sb = new StringBuilder(word);
        return word.equals(sb.reverse().toString());
    }

    public static List<String> stringToListOfWords(String str) {
        str = str.trim();
        if (str.isEmpty()) {
            return new ArrayList<>();
        }

        ArrayList<String> words = new ArrayList<>(Arrays.asList(str.split(" ")));
        for (int i = 0; i < words.size(); ) {
            if (words.get(i).isEmpty()) {
                words.remove(i);
            } else {
                i++;
            }
        }
        return words;
    }
}
