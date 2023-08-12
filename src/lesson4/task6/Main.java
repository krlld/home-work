package lesson4.task6;

import lesson4.utils.Utils;

import java.util.Arrays;

public class Main {
    //    Задача 6:
    //    Проверить, является ли массив возрастающей последовательностью (каждое следующее
    //    число больше предыдущего).
    public static void main(String[] args) {
        int[] arr = Utils.createArray();
        System.out.println("Array: " + Arrays.toString(arr));

        boolean flag = true;
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] <= arr[i - 1]) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("Every element of array more that previous");
        } else {
            System.out.println("Not every element of array more that previous");
        }
    }
}
