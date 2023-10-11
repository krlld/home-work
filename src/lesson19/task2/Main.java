package lesson19.task2;

import java.util.Arrays;

//  Задача 2:
//  Сортировка массива цифр в нескольких потоках различными алгоритмами:
//  - сортировка вставками;
//  - сортировка выбором;
//  - сортировка пузырьком.
//   Каждый вид сортировки должен запускаться в отдельном потоке. После вывести
//   результат отсортированных массивов в консоль.
public class Main {
    public static void main(String[] args) {
        int[] arr = {8, 6, 68, 8, 6, 675, 7, 8, 5, 776, 46, 8, 6, 68, 8, 6, 675, 7, 8, 5, 776, 46, 8, 6, 68, 8, 6, 675, 7, 8, 5, 776, 46,
                8, 6, 68, 8, 6, 675, 7, 8, 5, 776, 46, 8, 6, 68, 8, 6, 675, 7, 8, 5, 776, 46, 8, 6, 68, 8, 6, 675, 7, 8, 5, 776, 46,
                8, 6, 68, 8, 6, 675, 7, 8, 5, 776, 46, 8, 6, 68, 8, 6, 675, 7, 8, 5, 776, 46, 8, 6, 68, 8, 6, 675, 7, 8, 5, 776, 46};
        Thread bubbleSort = new BubbleSort(Arrays.copyOf(arr, arr.length));
        Thread selectionSort = new SelectionSort(Arrays.copyOf(arr, arr.length));
        Thread insertSort = new InsertSort(Arrays.copyOf(arr, arr.length));
        bubbleSort.start();
        selectionSort.start();
        insertSort.start();
    }
}
