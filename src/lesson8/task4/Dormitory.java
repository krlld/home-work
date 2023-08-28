package lesson8.task4;

import java.util.ArrayList;
import java.util.List;

public class Dormitory {
    private String address;
    private List<Student> studentList = new ArrayList<>();
    private List<Room> roomList = new ArrayList<>();

    public Dormitory(String address) {
        this.address = address;
        roomList.add(new Room(this, 1015));
    }

    public String getAddress() {
        return address;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public void addStudent(Student student) {
        Room room = roomList.get(0);
        student.setRoom(room);
        studentList.add(student);
    }

    @Override
    public String toString() {
        return "Dormitory address: " + address;
    }
}
