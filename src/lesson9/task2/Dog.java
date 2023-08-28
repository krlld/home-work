package lesson9.task2;

public class Dog {
    private static Dog INSTANCE;

    private Dog() {
    }

    // Singleton
    public static Dog getInstance() {
        return INSTANCE == null ? INSTANCE = new Dog() : INSTANCE;
    }

    // Factory method
    public static Dog factoryMethod() {
        return new Dog();
    }

    public void voice() {
    }

    public void eat() {
    }
}
