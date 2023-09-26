package lesson13.task3;

//  Задача 3:
//  Создать класс Student, содержащий следующие характеристики – имя, группа, курс,
//  оценки по предметам. Создать коллекцию, содержащую объекты класса Student.
//  Написать метод, который удаляет студентов со средним баллом <3. Если средний
//  балл>=3, студент переводится на следующий курс. Дополнительно написать метод
//  printStudents(List<Student> students, int course), который получает список студентов и
//  номер курса. А также печатает на консоль имена тех студентов из списка, которые
//  обучаются на данном курсе.
public class Main {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        studentList.add(new Student("1", "374383", 6, 8, 8, 9));
        studentList.add(new Student("2", "374383", 5, 5, 8, 5));
        studentList.add(new Student("3", "374383", 7, 3, 2, 3));
        System.out.println(studentList);

        studentList.incrementCourse();
        System.out.println(studentList);

        studentList.printStudents(6);
    }
}
