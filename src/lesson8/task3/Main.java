package lesson8.task3;

//  Задача *:
//  Самостоятельно изучить и показать пример работы интерфейса-маркера Cloneable.
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car car = new Car(new Engine(567));
        Car copy = car.copy();
        Car deepCopy = car.deepCopy();
        Car clone = (Car) car.clone();
        System.out.println("Copy: ");
        System.out.println(car + " : " + copy);
        System.out.println(car.getEngine() + " : " + copy.getEngine());

        System.out.println("Deep copy: ");
        System.out.println(car + " : " + deepCopy);
        System.out.println(car.getEngine() + " : " + deepCopy.getEngine());

        System.out.println("Clone: ");
        System.out.println(car + " : " + clone);
        System.out.println(car.getEngine() + " : " + clone.getEngine());
    }
}
