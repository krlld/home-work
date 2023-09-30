package lesson16.task2;

import java.util.*;

//  Задача *:
//  Создать набор данных в формате id-name, сохраненный в Map. Необходимо отобрать из
//  этого набора только те данные, id которых попадает в числовой диапазон 1/2/5/8/9/13.
//  Среди отобранных значений отобрать только те, которые имеют нечетное количество
//  букв в имени. После чего вернуть список List имен, записанных буквами задом наперед.
public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>() {{
            put(5, "Mike");
            put(6, "John");
            put(8, "Alise");
        }};
        Set<Integer> set = new HashSet<>(List.of(1, 2, 5, 8, 9, 13));
        List<String> result = map.entrySet().stream().
                filter(x -> set.contains(x.getKey())).
                filter(x -> x.getValue().length() % 2 == 1).
                map(x -> new StringBuilder(x.getValue()).reverse().toString()).
                toList();
        result.stream().forEach(System.out::println);
    }
}
