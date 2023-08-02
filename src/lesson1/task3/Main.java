package lesson1.task3;

public class Main {
    public static void main(String[] args) {
        int n = 145, sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println("Sum: " + sum);
    }
}