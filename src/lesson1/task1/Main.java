package lesson1.task1;

public class Main {
    //    Задача 1:
    //    Написать приложение, которое будет вычислять и выводить значение по формуле:
    //    a=4*(b+c-1)/2; b и c задаем в коде самостоятельно.
    public static void main(String[] args) {
        int b = 3, c = 5;
        float a = 4 * (b + c - 1) / 2f;
        System.out.println("Result: " + a);
    }
}