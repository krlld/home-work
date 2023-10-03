package lesson15.task2;

import java.util.Arrays;

//  Задача 2:
//  Используя Predicate среди массива чисел вывести только те, которые являются
//  положительными.
public class Main {
    public static void main(String[] args) {
        int[] arr = {6, 7, 8, -6, 9, 10};
        Arrays.stream(arr).filter(x -> x > 0).forEach(System.out::println);
    }
}
