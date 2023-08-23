package lesson8.task4;

public class Student extends Person {
    private String group;
    private Room room;

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Student(String name, String surname, String group) {
        super(name, surname);
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return super.toString() + ", group: " + group;
    }
}
