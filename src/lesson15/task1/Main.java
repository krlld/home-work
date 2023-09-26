package lesson15.task1;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

//  Задача 1:
//  Пользователь вводит в консоль дату своего рождения. Программа должна вернуть дату,
//  когда пользователю исполнится 100 лет. Использовать Date/Time API.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Inter your birthdate in format (yyyy-MM-dd): ");
                String birthDateString = scanner.nextLine();
                LocalDate birthDate = LocalDate.parse(birthDateString);
                System.out.println("You will 100 years at: " + birthDate.plusYears(100));
            } catch (DateTimeParseException exception) {
                System.out.println("Incorrect date format");
            }
        }
    }
}
