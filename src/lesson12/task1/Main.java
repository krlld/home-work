package lesson12.task1;

import java.io.*;

//  Задача 1:
//  В задании приложен файл Ромео и Джульетта на английском, вычитать его в приложении.
//  Проанализировать и записать в другой файл самое длинное слово.
public class Main {
    public static void main(String[] args) {
        File textFile = new File("src/lesson12/task1/text.txt");
        StringBuilder sb = new StringBuilder();

        try (BufferedReader bf = new BufferedReader(new FileReader(textFile))) {
            String str;
            while ((str = bf.readLine()) != null) {
                sb.append(str).append(" ");
            }
        } catch (FileNotFoundException exception) {
            System.out.println(exception.getMessage());
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }

        for (int i = 0; i < sb.length(); ) {
            if (Character.toLowerCase(sb.charAt(i)) == Character.toUpperCase(sb.charAt(i)) && sb.charAt(i) != ' ') {
                sb.deleteCharAt(i);
            } else {
                i++;
            }
        }

        String[] words = sb.toString().split(" ");
        String longWord = words[0];
        for (String word : words) {
            if (word.length() > longWord.length()) {
                longWord = word;
            }
        }

        File longWordFile = new File("src/lesson12/task1/theMostLongWord.txt");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(longWordFile))) {
            bw.write(longWord);
        } catch (FileNotFoundException exception) {
            System.out.println(exception.getMessage());
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
