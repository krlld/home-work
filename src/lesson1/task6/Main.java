package lesson1.task6;

public class Main {
    //    Задача *:
    //    Написать программу которая будет менять местами значение целочисленных
    //    переменных. Пример:
    //    int a = 1; int b = 2;
    //    //код (ваше решение)
    //    sout(a); //выведет 2
    //    sout(b); //выведет 1
    //    Усовершенствовать программу, использовать только 2 входные переменные (a,b);
    public static void main(String[] args) {
        int a = 5, b = 6;
        int buf = b;
        b = a;
        a = buf;
        System.out.println(a);
        System.out.println(b);
    }
}
