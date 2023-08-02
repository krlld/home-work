package lesson_1.task_6;

public class Main {
    public static void main(String[] args) {
        int a = 5, b = 6;
        int buf = b;
        b = a;
        a = buf;
        System.out.println(a);
        System.out.println(b);
    }
}
