package lesson13.task3;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    private List<Student> list = new ArrayList<>();

    public List<Student> getList() {
        return list;
    }

    public void add(Student student) {
        list.add(student);
    }

    public void incrementCourse() {
        for (int i = 0; i < list.size(); ) {
            if (list.get(i).getAverageMark() < 3) {
                list.remove(i);
            } else {
                list.get(i).incrementCourse();
                i++;
            }
        }
    }

    public void printStudents(int course) {
        for (Student student : list) {
            if (student.getCourse() == course) {
                System.out.println(student);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Student student : list) {
            sb.append(student).append("\n");
        }
        return sb.toString();
    }
}
