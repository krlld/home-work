package lesson19.task2;

import java.util.Arrays;

public class SelectionSort extends Thread {
    private final int[] arr;

    public SelectionSort(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            int buf = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = buf;
        }
        System.out.println("Selection sort:\t" + Arrays.toString(arr));
    }
}
