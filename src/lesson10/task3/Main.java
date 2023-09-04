package lesson10.task3;

import java.util.*;

//  3. Дана строка произвольной длины с произвольными словами.
//  Найти слово, в котором число различных символов минимально. Слово
//  может содержать буквы и цифры. Если таких слов несколько, найти первое
//  из них. Например, в строке "fffff ab f 1234 jkjk" найденное слово должно
//  быть "fffff".
public class Main {
    public static void main(String[] args) {
        String str = "      rgergergeg        rrrrrr      regg  e     gre grr    g     ";
        System.out.println(str);
        System.out.println(findWordWithMinUniqueSymbols(str));
    }

    public static String findWordWithMinUniqueSymbols(String str) {
        str = str.trim();
        if (str.isEmpty()) {
            return "";
        }

        ArrayList<String> words = new ArrayList<>(Arrays.asList(str.split(" ")));
        for (int i = 0; i < words.size(); ) {
            if (words.get(i).isEmpty()) {
                words.remove(i);
            } else {
                i++;
            }
        }

        Set[] set = new HashSet[words.size()];
        for (int i = 0; i < set.length; i++) {
            set[i] = new HashSet<>();
        }

        for (int i = 0; i < words.size(); i++) {
            for (int j = 0; j < words.get(i).length(); j++) {
                set[i].add(words.get(i).charAt(j));
            }
        }

        int index = 0;
        int minSize = set[index].size();
        for (int i = 0; i < set.length; i++) {
            if (minSize > set[i].size()) {
                minSize = set[i].size();
                index = i;
            }
        }

        return words.get(index);
    }
}
