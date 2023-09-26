package lesson14.task2;

import java.util.Arrays;

// Task about students list
public class Main {
    public static void main(String[] args) {
        StudentList studentList = new StudentList(Arrays.asList(
                new Student("283745", 8),
                new Student("283744", 7),
                new Student("283748", 9),
                new Student("283744", 10),
                new Student("283745", 8)
        ));
        System.out.println(studentList.countByMark(8));
        System.out.println(studentList.groupWithMinStudentsCount());
    }
}
