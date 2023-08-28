package lesson8.task4;

public class Room {
    private Dormitory dormitory;
    private int roomNumber;

    public Room(Dormitory dormitory, int roomNumber) {
        this.dormitory = dormitory;
        this.roomNumber = roomNumber;
    }

    public Dormitory getDormitory() {
        return dormitory;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    @Override
    public String toString() {
        return "Room number: " + roomNumber + ", " + dormitory.toString();
    }
}
