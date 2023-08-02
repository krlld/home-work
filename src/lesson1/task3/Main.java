package lesson1.task3;

public class Main {
    //    Задача 3:
    //    В переменной n хранится трёхзначное число. Создайте программу, вычисляющую и
    //    выводящую на экран сумму цифр n. Например: n =126, в результате мы должны получить
    //    9 (1+2+6).
    public static void main(String[] args) {
        int n = 145, sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println("Sum: " + sum);
    }
}