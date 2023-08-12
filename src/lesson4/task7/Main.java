package lesson4.task7;

import java.util.Arrays;

public class Main {
    //    Задача *:
    //    Имеется массив из неотрицательных чисел(любой). Представьте что массив
    //    представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} -> 999). Задача
    //    добавить единицу к этому “числу” и на выходе получить исправленный массив. Массив не
    //    содержит нуля в начале, кроме самого числа 0.
    public static void main(String[] args) {
        int[] arr = {9, 9, 9, 9, 9, 9, 9};
        System.out.println("Array: " + Arrays.toString(arr));

        if (arr[arr.length - 1] != 9) {
            arr[arr.length - 1]++;
            System.out.println("New array: " + Arrays.toString(arr));
            return;
        }

        long number = 0;
        for (int i = arr.length - 1; i >= 0; --i) {
            number += arr[i] * (long) Math.pow(10, arr.length - i - 1);
        }
        number++;

        int[] newArr = new int[countOfSign(number)];
        for (int i = newArr.length - 1; i >= 0; --i) {
            newArr[i] = (int) number % 10;
            number /= 10;
        }

        System.out.println("New array: " + Arrays.toString(newArr));
    }

    public static int countOfSign(long number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}
