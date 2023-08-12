package lesson4.task4;

import lesson4.utils.Utils;

import java.util.Arrays;

public class Main {
    //    Задача 4:
    //    Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести
    //    сообщение, что их нет.
    public static void main(String[] args) {
        int[] arr = Utils.createArray();
        System.out.println("Array: " + Arrays.toString(arr));

        int count = 0;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == 0) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Array isn't contain 0");
        } else {
            System.out.println("Count of 0: " + count);
        }
    }
}
