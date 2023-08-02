package lesson1.task2;

public class Main {
    //    Задача 2:
    //    В переменной n хранится двузначное число. Создайте программу, вычисляющую и
    //    выводящую на экран сумму цифр n. Например: n =26, в результате мы должны получить 8
    //    (2+6).
    public static void main(String[] args) {
        int n = 89, sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println("Sum: " + sum);
    }
}