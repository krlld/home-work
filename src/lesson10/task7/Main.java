package lesson10.task7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//  3. Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых меньше
//  средней, а также их длину.
public class Main {
    public static void main(String[] args) {
        final int SIZE = 3;
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>(3);
        for (int i = 0; i < SIZE; i++) {
            list.add(scanner.nextLine());
        }
        float averageLength = 0;
        for (String str : list) {
            averageLength += str.length();
        }
        averageLength /= list.size();
        System.out.println("Average length: " + averageLength);
        for (String str : list) {
            if (str.length() < averageLength) {
                System.out.println(str);
            }
        }
    }
}
