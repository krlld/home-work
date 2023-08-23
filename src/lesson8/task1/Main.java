package lesson8.task1;

//  Задача 1:
//  Создать классы "Директор", "Рабочий", "Бухгалтер". Реализовать интерфейс с методом,
//  который печатает название должности и имплементировать этот метод в созданные
//  классы.
public class Main {
    public static void main(String[] args) {
        Employee[] employees = {new Director(), new Worker(), new Accountant()};
        for (Employee employee : employees) {
            employee.printPosition();
        }
    }
}
