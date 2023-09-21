package lesson14.task2;

public class Student {
    private String group;
    private float mark;

    public Student(String group, float mark) {
        this.group = group;
        this.mark = mark;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }
}
