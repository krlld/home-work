package lesson2.task2;

import java.util.Scanner;

public class Main {
    //    Задача 2:
    //    Для введенного числа t (температура на улице) вывести: Если t>–5, то вывести «Warm».
    //    Если –5>= t > –20, то вывести «Normal». Если –20>= t, то вывести «Cold».
    public static void main(String[] args) {
        System.out.print("Enter temperature: ");
        Scanner scanner = new Scanner(System.in);
        int temperature = scanner.nextInt();
        if (temperature > -5) {
            System.out.println("Warm");
        } else if (temperature <= -5 && temperature > -20) {
            System.out.println("Normal");
        } else {
            System.out.println("Cold");
        }
    }
}
