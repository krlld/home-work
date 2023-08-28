package lesson8.task4;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Student> studentList = new ArrayList<>();
    private List<Employee> employeeList = new ArrayList<>();
    private List<Dormitory> dormitoryList = new ArrayList<>();

    public University() {
        addDormitory(new Dormitory("пр. Дзержинского 95"));
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public List<Dormitory> getDormitoryList() {
        return dormitoryList;
    }

    public void addStudent(Student student) {
        Dormitory dormitory = dormitoryList.get(0);
        dormitory.addStudent(student);
        studentList.add(student);
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void addDormitory(Dormitory dormitory) {
        dormitoryList.add(dormitory);
    }

    public void showAllStudents() {
        System.out.println("All students: ");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    public void showAllEmployees() {
        System.out.println("All employees: ");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}
