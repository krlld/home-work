package lesson12.task2;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//  Задача *:
//  Допустим есть txt файл с номерами документов. Номером документа является строка,
//  состоящая из букв и цифр(без служебных символов). Пусть этот файл содержит каждый
//  номер документа с новой строки и в строке никакой другой информации, только номер
//  документа. Валидный номер документа должен иметь длину 15 символов и начинаться с
//  последовательности docnum(далее любая последовательность букв/цифр) или
//  contract(далее любая последовательность букв/цифр). Написать программу для чтения
//  информации из входного файла - путь к входному файлу должен задаваться через
//  консоль. Программа должна проверять номера документов на валидность. Валидные
//  номера документов следует записать в один файл-отчет. Невалидные номера документов
//  следует записать в другой файл-отчет, но после номеров документов следует добавить
//  информацию о том, почему этот документ не валиден.
public class Main {
    public static void main(String[] args) {
        System.out.println("Input docs file path: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        try {
            List<String> docsList = readFile(path);
            File validDocsFile = new File("src/lesson12/task2/validDocs.txt");
            File invalidDocsFile = new File("src/lesson12/task2/invalidDocs.txt");
            BufferedWriter bwValid = new BufferedWriter(new FileWriter(validDocsFile));
            BufferedWriter bwInvalid = new BufferedWriter(new FileWriter(invalidDocsFile));

            for (String doc : docsList) {
                try {
                    if (isValidDoc(doc)) {
                        bwValid.write(doc);
                        bwValid.newLine();
                    }
                } catch (InvalidDocException exception) {
                    bwInvalid.write(doc + " " + exception.getMessage());
                    bwInvalid.newLine();
                }
            }

            bwValid.close();
            bwInvalid.close();
        } catch (FileNotFoundException exception) {
            System.out.println("File not found" + exception.getMessage());
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static List<String> readFile(String path) throws IOException {
        File docsFile = new File(path);
        List<String> docsList = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(docsFile))) {
            String str;
            while ((str = br.readLine()) != null) {
                docsList.add(str);
            }
        }
        return docsList;
    }

    public static boolean isValidDoc(String doc) throws InvalidDocException {
        if (doc.length() != 15) {
            throw new InvalidDocException("Length != 15");
        }
        if (!(doc.startsWith("docnum") || doc.startsWith("contract"))) {
            throw new InvalidDocException("Doc start with incorrect substring");
        }
        if (!isAlphaDigit(doc)) {
            throw new InvalidDocException("Doc symbol is not alpha or digit");
        }
        return true;
    }

    public static boolean isAlphaDigit(String str) {
        for (char c : str.toCharArray()) {
            if (!(Character.isAlphabetic(c) || Character.isDigit(c))) {
                return false;
            }
        }
        return true;
    }
}
