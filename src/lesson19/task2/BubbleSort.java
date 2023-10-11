package lesson19.task2;

import java.util.Arrays;

public class BubbleSort extends Thread {
    private final int[] arr;

    public BubbleSort(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int buf = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = buf;
                }
            }
        }
        System.out.println("Bubble sort:\t" + Arrays.toString(arr));
    }
}
