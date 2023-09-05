package lesson11.task2;

//  Задача *:
//  Написать try/catch/finally, в котором finally вызван не будет.
public class Main {
    public static void main(String[] args) {
        try {
            System.exit(1);
        } catch (Exception exception) {
            System.out.println("Called block catch");
        } finally {
            System.out.println("Called block finally");
        }
    }
}
