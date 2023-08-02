package lesson1.task4;

public class Main {
    //    Задача 4:
    //    В переменной n хранится вещественное число с ненулевой дробной частью. Создайте
    //    программу, округляющую число n до ближайшего целого и выводящую результат на
    //    экран.
    public static void main(String[] args) {
        float n = 16.8f;
        if (n - (int) n >= 0.5f)
            n = (int) n + 1;
        else
            n = (int) n;
        System.out.println("Result: " + n);
    }
}