package lesson4.task8;

import lesson4.utils.Utils;

import java.util.Arrays;

public class Main {
    // Hoare or quick sort
    public static void main(String[] args) {
        int[] arr = Utils.createArray();
        System.out.println("Array: " + Arrays.toString(arr));

        sort(arr, 0, arr.length - 1);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void sort(int[] arr, int startIndex, int endIndex) {
        int middleElement = arr[(startIndex + endIndex) / 2], leftIndex = startIndex, rightIndex = endIndex;
        do {
            while (middleElement > arr[leftIndex]) {
                leftIndex++;
            }
            while (middleElement < arr[rightIndex]) {
                rightIndex--;
            }
            if (leftIndex <= rightIndex) {
                swap(arr, leftIndex, rightIndex);
                leftIndex++;
                rightIndex--;
            }
        } while (leftIndex < rightIndex);
        if (leftIndex < endIndex) {
            sort(arr, leftIndex, endIndex);
        }
        if (rightIndex > startIndex) {
            sort(arr, startIndex, rightIndex);
        }
    }

    public static void swap(int[] arr, int firstIndex, int secondIndex) {
        int buf = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = buf;
    }
}
