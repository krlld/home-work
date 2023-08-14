package lesson4.task1;

import lesson4.utils.Utils;

public class Main {
    //    Задача 1:
    //    Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
    public static void main(String[] args) {
        int[] arr = Utils.createArray();

        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for (int i = arr.length - 1; i >= 0; --i) {
            System.out.print(arr[i] + " ");
        }
    }
}
