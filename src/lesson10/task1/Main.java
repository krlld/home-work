package lesson10.task1;

import java.util.Scanner;

//    1. Написать программу со следующим функционалом:
//    На вход передать строку (будем считать, что это номер документа).
//    Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x — это число,
//    а y — это буква.
//    - Вывести на экран в одну строку два первых блока по 4 цифры.
//    - Вывести на экран номер документа, но блоки из трех букв заменить
//    на *** (каждая буква заменятся на *).
//    - Вывести на экран только одни буквы из номера документа в формате
//    yyy/yyy/y/y в нижнем регистре.
//    - Вывести на экран буквы из номера документа в формате
//    "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью
//    класса StringBuilder).
//    - Проверить содержит ли номер документа последовательность abc и
//    вывети сообщение содержит или нет(причем, abc и ABC считается
//    одинаковой последовательностью).
//    - Проверить начинается ли номер документа с последовательности 555.
//    - Проверить заканчивается ли номер документа на
//    последовательность 1a2b.
//    Все эти методы реализовать в отдельном классе в статических методах,
//    которые на вход (входным параметром) будут принимать вводимую на вход
//    программы строку.
public class Main {
    public static void main(String[] args) {
        String str = "4534-jGo-5353-tnt-5g7i";
        if (isCorrectNumber(str)) {
            System.out.println("String is correct");
        } else {
            return;
        }
        System.out.println("1) Вывести на экран в одну строку два первых блока по 4 цифры.\n" +
                "2) Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *).\n" +
                "3) Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре.\n" +
                "4) Вывести на экран буквы из номера документа в формате Letters:yyy/yyy/y/y в верхнем регистре(реализовать с помощью класса StringBuilder).\n" +
                "5) Проверить содержит ли номер документа последовательность abc и вывети сообщение содержит или нет(причем, abc и ABC считается одинаковой последовательностью).\n" +
                "6) Проверить начинается ли номер документа с последовательности 555.\n" +
                "7) Проверить заканчивается ли номер документа на последовательность 1a2b.\n");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            switch (scanner.nextInt()) {
                case 1 -> printTwoFirstBlocks(str);
                case 2 -> printWithStars(str);
                case 3 -> printAlphasInLowerCase(str);
                case 4 -> printAlphasInUpperCase(str);
                case 5 -> System.out.println(isContainABC(str));
                case 6 -> System.out.println(isStartWith555(str));
                case 7 -> System.out.println(isEndsWith1a2b(str));
            }
        }
    }

    //  - Вывести на экран в одну строку два первых блока по 4 цифры.
    public static void printTwoFirstBlocks(String str) {
        String[] blocks = str.split("-");
        System.out.println(blocks[0] + " and " + blocks[2]);
    }

    //  - Вывести на экран номер документа, но блоки из трех букв заменить
    //  на *** (каждая буква заменятся на *).
    public static void printWithStars(String str) {
        String[] blocks = str.split("-");
        blocks[1] = blocks[3] = "***";
        str = String.join("-", blocks);
        System.out.println(str.substring(0, str.length() - 2));
    }

    //  - Вывести на экран только одни буквы из номера документа в формате
    //  yyy/yyy/y/y в нижнем регистре.
    public static void printAlphasInLowerCase(String str) {
        str = str.toLowerCase();
        String[] blocks = str.split("-");
        StringBuilder sb = new StringBuilder();
        sb.append(blocks[1]).append("/").append(blocks[3]).append("/").append(blocks[4].charAt(1)).append("/").append(blocks[4].charAt(3));
        System.out.println(sb);
    }

    //  - Вывести на экран буквы из номера документа в формате
    //  "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью
    //  класса StringBuilder).
    public static void printAlphasInUpperCase(String str) {
        str = str.toUpperCase();
        String[] blocks = str.split("-");
        StringBuilder sb = new StringBuilder();
        sb.append("Letters:").append(blocks[1]).append("/").append(blocks[3]).append("/").append(blocks[4].charAt(1)).append("/").append(blocks[4].charAt(3));
        System.out.println(sb);
    }

    //  - Проверить содержит ли номер документа последовательность abc и
    //  вывети сообщение содержит или нет(причем, abc и ABC считается
    //  одинаковой последовательностью).
    public static boolean isContainABC(String str) {
        str = str.toLowerCase();
        return str.contains("abc");
    }

    //  - Проверить начинается ли номер документа с последовательности 555.
    public static boolean isStartWith555(String str) {
        return str.startsWith("555");
    }

    //  - Проверить заканчивается ли номер документа на
    //  последовательность 1a2b.
    public static boolean isEndsWith1a2b(String str) {
        return str.endsWith("1a2b");
    }

    //  4534-jGo-5353-tnt-5g7i
    public static boolean isCorrectNumber(String str) {
        String regex = "[0-9]{4}-[a-zA-Z]{3}-[0-9]{4}-[a-zA-Z]{3}-[0-9][a-zA-Z][0-9][a-zA-Z]";
        return str.matches(regex);
    }
}
