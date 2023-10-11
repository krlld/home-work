package lesson19.task1;

import java.util.Comparator;
import java.util.List;

//  Задача 1:
//  Пользователь вводит с клавиатуры значение в массив. После чего запускаются два
//  потока. Первый поток находит максимум в массиве, второй — минимум. Результаты
//  вычислений возвращаются в метод main().
public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(5, 6, 7, 8, 9);
        Comparator<Integer> integerComparator = (x, y) -> {
            if (x > y) return 1;
            else if (x < y) return -1;
            else return 0;
        };
        Thread minTread = new Thread(() -> System.out.println(list.stream().min(integerComparator).get()));
        Thread maxTread = new Thread(() -> System.out.println(list.stream().max(integerComparator).get()));
        minTread.start();
        maxTread.start();
    }
}
