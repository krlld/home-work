package lesson4.task5;

import lesson4.utils.Utils;

import java.util.Arrays;

public class Main {
    //    Задача 5:
    //    Пройти по массиву и поменять местами элементы первый и последний, второй и
    //    предпоследний и т.д.
    public static void main(String[] args) {
        int[] arr = Utils.createArray();
        System.out.println("Array before reverse: " + Arrays.toString(arr));

        for (int i = 0, j = arr.length - 1; i < arr.length / 2; ++i, --j) {
            int buf = arr[i];
            arr[i] = arr[j];
            arr[j] = buf;
        }

        System.out.println("Array after reverse: " + Arrays.toString(arr));
    }
}
