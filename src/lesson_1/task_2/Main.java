package lesson_1.task_2;

public class Main {
    public static void main(String[] args) {
        int n = 89, sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println("Sum: " + sum);
    }
}