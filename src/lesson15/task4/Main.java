package lesson15.task4;

import java.util.function.Consumer;

//  Задача 4:
//  Используя Consumer реализовать лямбду, которая будет принимать в себя строку в
//  формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
//  выводить сумму, переведенную сразу в доллары.
public class Main {
    public static void main(String[] args) {
        Consumer<String> consumer = str -> System.out.println(Double.parseDouble(str.substring(0, str.length() - 4)) * 3);
        consumer.accept("678.89 BYN");
    }
}
