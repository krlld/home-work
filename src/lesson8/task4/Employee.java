package lesson8.task4;

public class Employee extends Person {
    private Position position;

    public Employee(String name, String surname, Position position) {
        super(name, surname);
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return super.toString() + ", position: " + position;
    }
}
