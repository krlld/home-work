package lesson13.task2;

//  Задача 2:
//  Создать класс, который будет хранить в себе коллекцию с названиями животных.
//  Реализовать методы удаления и добавления животных по следующим правилам:
//  добавляется всегда в начало коллекции, а удаляется всегда из конца. Показать работу
//  объекта этого класса в main методе другого класса.
public class Main {
    public static void main(String[] args) {
        AnimalList animalList = new AnimalList();
        System.out.println(animalList);

        animalList.add(new Animal("Cat"));
        animalList.add(new Animal("Dog"));
        animalList.add(new Animal("Bird"));
        System.out.println(animalList);

        animalList.remove();
        System.out.println(animalList);
    }
}
