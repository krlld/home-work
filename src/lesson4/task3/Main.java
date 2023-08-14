package lesson4.task3;

import lesson4.utils.Utils;

import java.util.Arrays;

public class Main {
    //    Задача 3:
    //    Найти индексы минимального и максимального элементов и вывести в консоль.
    public static void main(String[] args) {
        int[] arr = Utils.createArray();
        int min = arr[0], indexMin = 0;
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] < min) {
                min = arr[i];
                indexMin = i;
            }
        }

        int max = arr[0], indexMax = 0;
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] > max) {
                max = arr[i];
                indexMax = i;
            }
        }

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Min element index: " + (indexMin + 1));
        System.out.println("Max element: " + (indexMax + 1));
    }
}
