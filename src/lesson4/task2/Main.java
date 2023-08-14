package lesson4.task2;

import lesson4.utils.Utils;

import java.util.Arrays;

public class Main {
    //    Задача 2:
    //    Найти минимальный-максимальный элементы и вывести в консоль.
    public static void main(String[] args) {
        int[] arr = Utils.createArray();
        int min = arr[0];
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Min element: " + min);
        System.out.println("Max element: " + max);
    }
}
