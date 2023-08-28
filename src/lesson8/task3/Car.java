package lesson8.task3;

public class Car implements Cloneable {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public Car copy() {
        return new Car(engine);
    }

    public Car deepCopy() {
        return new Car(engine.copy());
    }

    @Override
    protected Car clone() throws CloneNotSupportedException {
        Car car = (Car) super.clone();
        car.engine = engine.clone();
        return car;
    }
}
