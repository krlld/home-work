package lesson13.task3;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String group;
    private int course;
    private List<Integer> marks = new ArrayList<>();

    public Student(String name, String group, int course, int... marks) {
        this.name = name;
        this.group = group;
        this.course = course;
        for (int mark : marks) {
            this.marks.add(mark);
        }
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public double getAverageMark() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.size();
    }

    public void incrementCourse() {
        course++;
    }

    @Override
    public String toString() {
        return "Student: " + name + ", group: " + group + " ,course: " + course;
    }
}
