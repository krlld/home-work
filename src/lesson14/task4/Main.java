package lesson14.task4;

// Task with two stacks to queue
public class Main {
    public static void main(String[] args) {
        CustomQueue<Integer> queue = new CustomQueue<>();
        queue.add(5);
        queue.add(6);
        queue.add(7);
        System.out.println(queue.get());
        queue.add(10);

        System.out.println(queue.get());
        System.out.println(queue.get());
        System.out.println(queue.get());
    }
}
