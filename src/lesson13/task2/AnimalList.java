package lesson13.task2;

import java.util.LinkedList;
import java.util.Queue;

public class AnimalList {
    private Queue<Animal> queue = new LinkedList<>();

    public boolean add(Animal animal) {
        return queue.add(animal);
    }

    public Animal remove() {
        return queue.poll();
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
