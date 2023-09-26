package lesson13.task4;

//  Задача *:
//  Представим, что в Java нет коллекции типа ArrayList. Создать свой класс, симулирующий
//  работу класса динамической коллекции - т.е. создать свою кастомную коллекцию. В
//  основе коллекции будет массив. Кастомная коллекция должна хранить элементы разных
//  классов(т.е. это generic).

//  Предусмотреть операции(методы):
//  1. добавления элемента
//  2. удаления элемента
//  3. получение элемента по индексу
//  4. проверка есть ли элемент в коллекции
//  5. очистка всей коллекции

//  Предусмотреть конструктор без параметров - создает массив размером
//  по умолчанию. Предусмотреть конструктор с задаваемым размером внутреннего
//  массива. Предусмотреть возможность автоматического расширения коллекции при
//  добавлении элемента в том случае, когда коллекция уже заполнена.
public class Main {
    public static void main(String[] args) {
        CustomArrayList<Integer> customArrayList = new CustomArrayList<>();
        customArrayList.add(10);
        customArrayList.add(16);
        customArrayList.add(20);
        customArrayList.add(15, 1);
        for (Integer i : customArrayList) {
            System.out.print(i + " ");
        }
        System.out.println();

        customArrayList.remove(0);
        for (Integer i : customArrayList) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println(customArrayList.get(1));

        System.out.println(customArrayList.isContains(16));

        customArrayList.clear();
        for (Integer i : customArrayList) {
            System.out.print(i + " ");
        }
        System.out.println(customArrayList.isEmpty());
    }
}
