package lesson9.task2;

//  Задача *:
//  Написать такой конструктор, который запретит создание объекта класса Dog в других
//  классах; Найти способ вызывать методы voice(), eat() класса Dog, который позволит
//  обойти ограничение, наложенное конструктором выше. Объяснить, как работают оба
//  способа.
public class Main {
    public static void main(String[] args) {
        Dog dog = Dog.getInstance();
        Dog dog1 = Dog.factoryMethod();
    }
}
