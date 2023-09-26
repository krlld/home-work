package lesson14.task5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Count of repeat
public class Main {
    public static void main(String[] args) {
        System.out.println(repeatCount(Arrays.asList(7, 8, 6, 7, 6, 5, 7, 8)));
    }

    public static int repeatCount(List list) {
        Set set = new HashSet(list);
        return list.size() - set.size();
    }
}
