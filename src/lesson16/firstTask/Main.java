package lesson16.firstTask;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Map<Product, Integer> map1 = new HashMap<>();
        map1.put(new Product(100, "Computer"), 10);
        map1.put(new Product(80, "Telephone"), 10);
        map1.put(new Product(90, "Iphone"), 10);
        Order order1 = new Order(map1, "1");

        Map<Product, Integer> map2 = new HashMap<>();
        map2.put(new Product(100, "Computer"), 10);
        map2.put(new Product(80, "Imac"), 10);
        map2.put(new Product(90, "Watch"), 10);
        Order order2 = new Order(map2, "1");

        List<Order> list = Arrays.asList(order1, order2);
        Map<String, List<Product>> names = list.stream().
                flatMap(order -> order.getMap().keySet().stream()).
                collect(Collectors.groupingBy(Product::getName));
        String name = names.entrySet().stream().
                max((x, y) -> {
                    if (x.getValue().size() > y.getValue().size()) return 1;
                    else if (x.getValue().size() < y.getValue().size()) return -1;
                    else return 0;
                }).get().getKey();
        System.out.println(name);
    }
}
