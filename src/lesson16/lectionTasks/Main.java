package lesson16.lectionTasks;

import java.io.File;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Map<Product, Integer> map1 = new HashMap<>();
        map1.put(new Product(100, "Computer"), 10);
        map1.put(new Product(80, "Telephone"), 10);
        map1.put(new Product(90, "Iphone"), 10);
        Order order1 = new Order(map1, "John");

        Map<Product, Integer> map2 = new HashMap<>();
        map2.put(new Product(100, "Computer"), 10);
        map2.put(new Product(120, "Imac"), 10);
        map2.put(new Product(90, "Watch"), 10);
        Order order2 = new Order(map2, "Alise");

        Map<Product, Integer> map3 = new HashMap<>();
        map3.put(new Product(100, "Computer"), 10);
        map3.put(new Product(80, "Imac"), 10);
        map3.put(new Product(50, "Watch"), 10);
        Order order3 = new Order(map3, "Mike");

        List<Order> list = Arrays.asList(order1, order2, order3);

        System.out.println(theMostPopularProduct(list));
        System.out.println(theMostProfitClient(list));
    }

    public static String theMostPopularProduct(List<Order> list) {
        Map<String, List<Product>> names = list.stream().
                flatMap(order -> order.getMap().keySet().stream()).
                collect(Collectors.groupingBy(Product::getName));
        String name = names.entrySet().stream().
                max((x, y) -> {
                    if (x.getValue().size() > y.getValue().size()) return 1;
                    else if (x.getValue().size() < y.getValue().size()) return -1;
                    else return 0;
                }).orElseThrow().getKey();
        return name;
    }

    public static String theMostProfitClient(List<Order> list) {
        Map<String, List<Order>> clients = list.stream().
                collect(Collectors.groupingBy(Order::getName));
        String client = clients.entrySet().stream().
                map(x -> new AbstractMap.SimpleEntry<>(x.getKey(), x.getValue().stream().
                        flatMap(order -> order.getMap().entrySet().stream()).
                        map(entry -> entry.getKey().getPrice() * entry.getValue()).
                        reduce(Float::sum).orElseThrow())).
                max((x, y) -> {
                    if (x.getValue() > y.getValue()) return 1;
                    else if (x.getValue() < y.getValue()) return -1;
                    else return 0;
                }).
                orElseThrow().
                getKey();
        return client;
    }
}
