package lesson16.task1;

import java.util.Arrays;
import java.util.List;

//  Задача 1:
//  Создать коллекцию класса ArrayList наполнить ее элементами типа Integer. С помощью
//  Stream'ов:
//  - Удалить дубликаты
//  - Оставить только четные элементы
//  - Вывести сумму оставшихся элементов в стриме
public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 6, 7, 8, 5, 8, 9);
        list.stream().distinct().
                filter(x -> x % 2 == 0).
                reduce(Integer::sum).
                ifPresentOrElse(System.out::println, ()->System.out.println("No value present"));
    }
}
