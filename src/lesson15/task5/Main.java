package lesson15.task5;

import java.util.Scanner;
import java.util.function.Supplier;

//  Задача 5:
//  Используя Supplier написать метод, который будет возвращать введенную с консоли
//  строку задом наперед.
public class Main {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> {
            Scanner scanner = new Scanner(System.in);
            StringBuilder stringBuilder = new StringBuilder(scanner.nextLine());
            return stringBuilder.reverse().toString();
        };
        System.out.println(supplier.get());
    }
}
