package lesson16.lectionTasks;

import java.util.Map;

public class Order {
    private Map<Product, Integer> map;
    private String name;

    public Order(Map<Product, Integer> map, String name) {
        this.map = map;
        this.name = name;
    }

    public Map<Product, Integer> getMap() {
        return map;
    }

    public String getName() {
        return name;
    }
}
