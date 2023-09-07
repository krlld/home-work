package lesson10.task6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

//  2. Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке возрастания
//  значений их длины.
public class Main {
    public static void main(String[] args) {
        final int SIZE = 3;
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>(SIZE);
        for (int i = 0; i < SIZE; i++) {
            list.add(scanner.nextLine());
        }
        Comparator<String> comparator = (str1, str2) -> ((Integer) str1.length()).compareTo(str2.length());
        list.sort(comparator);
        System.out.println(list);
    }
}
