package lesson14.task4;

import java.util.Stack;

public class CustomQueue<T> {
    final private Stack<T> inputStack = new Stack<>();
    final private Stack<T> outputStack = new Stack<>();

    public void add(T element) {
        inputStack.push(element);
    }

    public T get() {
        if (outputStack.empty()) {
            while (!inputStack.empty()) {
                outputStack.push(inputStack.pop());
            }
        }
        return outputStack.pop();
    }

    public boolean isEmpty() {
        return inputStack.empty() && outputStack.empty();
    }
}
