package lesson8.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        University university = new University();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1) Добавление студента в универ(сразу заселится в общежитие)\n2) Добавление сотрудника в универ\n3) Просмотр всех студентов\n4) Просмотр всех сотрудников\n5) Получить комнату и общежитие по студенту\n6) Выход.");
            switch (scanner.nextInt()) {
                case 1:
                    Student student = new Student("Ivan", "Ivanov", "070503");
                    university.addStudent(student);
                    break;
                case 2:
                    Employee employee = new Employee("Petr", "Petrov", Position.TEACHER);
                    university.addEmployee(employee);
                    break;
                case 3:
                    university.showAllStudents();
                    break;
                case 4:
                    university.showAllEmployees();
                    break;
                case 5:
                    Student student1 = university.getStudentList().get(0);
                    System.out.println(student1);
                    System.out.println(student1.getRoom());
                    System.out.println(student1.getRoom().getDormitory());
                    break;
            }
        }
    }
}
