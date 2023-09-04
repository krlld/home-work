package lesson10.task5;

//  5. Дана произвольная строка.
//  Вывести на консоль новую строку, которой задублирована каждая буква из
//  начальной строки.
//  Например, "Hello" -> "HHeelllloo".
public class Main {
    public static void main(String[] args) {
        String str = "Wou";
        System.out.println(str);
        System.out.println(doubleString(str));
    }

    public static String doubleString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i)).append(str.charAt(i));
        }
        return sb.toString();
    }
}
