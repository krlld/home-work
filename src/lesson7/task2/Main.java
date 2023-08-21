package lesson7.task2;

import java.lang.reflect.Field;

//    Задача *:
//    Создать класс Apple и добавить в него поле color с модификатором доступа private и
//    инициализировать его. В методе main другого класса создать объект Apple, и не
//    используя сеттеры изменить значение поля color.
public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Apple apple = new Apple();
        apple.showColor();
        Field field = Apple.class.getDeclaredField("color");
        field.setAccessible(true);
        field.set(apple, "Yellow");
        apple.showColor();
    }
}
