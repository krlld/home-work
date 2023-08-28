package lesson8.task2;

//  Задача 2:
//  Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг. Реализовать
//  функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя
//  абстрактный класс/методы). Создать массив из 5 разных фигур. Вывести на экран сумму
//  периметра всех фигур в массиве.
public class Main {
    public static void main(String[] args) {
        Figure[] figures = {new Triangle(5, 6, 7), new Rectangle(5, 6), new Circle(5)};
        double sum = 0;
        for (Figure figure : figures) {
            sum += figure.perimeter();
            System.out.println(figure.getClass().getName() + ", Perimeter: " + figure.perimeter() + ", Square: " + figure.square());
        }
        System.out.println("Perimeters sum: " + sum);
    }
}
