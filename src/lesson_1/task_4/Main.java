package lesson_1.task_4;

public class Main {
    public static void main(String[] args) {
        float n = 16.8f;
        if (n - (int) n >= 0.5f)
            n = (int) n + 1;
        else
            n = (int) n;
        System.out.println("Result: " + n);
    }
}