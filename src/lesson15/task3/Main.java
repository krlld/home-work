package lesson15.task3;

import java.util.function.Function;

//  Задача 3:
//  Используя Function реализовать лямбду, которая будет принимать в себя строку в
//  формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
//  возвращать сумму, переведенную сразу в доллары.
public class Main {
       public static void main(String[] args) {
        Function<String, Double> function = str -> Double.parseDouble(str.substring(0, str.length() - 4)) * 3;
        System.out.println(function.apply("123.45 BYN"));
    }
}
