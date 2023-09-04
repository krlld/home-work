package lesson10.task2;

//  2. Дана строка произвольной длины с произвольными словами.
//  Найти самое короткое слово в строке и вывести его на экран.
//  Найти самое длинное слово в строке и вывести его на экран.
//  Если таких слов несколько, то вывести последнее из них.
public class Main {
    public static void main(String[] args) {
        String str = "   fewfwe fwfw  w      fw f   wefwef   ";
        System.out.println("String: " + str);
        System.out.println("The most shortest word: " + findTheMostShortestWord(str));
        System.out.println("The most longest word: " + findTheMostLongestWord(str));
    }

    public static String findTheMostShortestWord(String str) {
        str = str.trim();
        if (str.isEmpty()) {
            return "";
        }
        String[] words = str.split(" ");
        String shortWord = words[0];
        for (String word : words) {
            if (word.isEmpty()) {
                continue;
            }
            if (shortWord.length() >= word.length()) {
                shortWord = word;
            }
        }
        return shortWord;
    }

    public static String findTheMostLongestWord(String str) {
        str = str.trim();
        if (str.isEmpty()) {
            return "";
        }
        String[] words = str.split(" ");
        String longWord = words[0];
        for (String word : words) {
            if (longWord.length() <= word.length()) {
                longWord = word;
            }
        }
        return longWord;
    }
}
