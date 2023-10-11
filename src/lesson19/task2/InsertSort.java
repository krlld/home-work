package lesson19.task2;

import java.util.Arrays;

public class InsertSort extends Thread {
    private final int[] arr;

    public InsertSort(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 && arr[j - 1] > arr[j]; j--) {
                int buf = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = buf;
            }
        }
        System.out.println("Insert sort:\t" + Arrays.toString(arr));
    }
}
