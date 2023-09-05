package lesson11.task1;

import java.util.Scanner;

//  Задача 1:
//  Создать класс, в котором будет статический метод. Этот метод принимает на вход три
//  параметра: login, password, confirmPassword. Все поля имеют тип данных String. Длина
//  login должна быть меньше 20 символов и не должен содержать пробелы. Если login не
//  соответствует этим требованиям, необходимо выбросить WrongLoginException. Длина
//  password должна быть меньше 20 символов, не должен содержать пробелом и должен
//  содержать хотя бы одну цифру. Также password и confirmPassword должны быть равны.
//  Если password не соответствует этим требованиям, необходимо выбросить
//  WrongPasswordException. WrongPasswordException и WrongLoginException -
//  пользовательские классы исключения с двумя конструкторами – один по умолчанию,
//  второй принимает сообщение исключения и передает его в конструктор класса Exception.
//  Метод возвращает true, если значения верны, false в противном случае.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter:\n-login\n-password\n-confirm password");
            String login = scanner.nextLine();
            String password = scanner.nextLine();
            String confirmPassword = scanner.nextLine();
            try {
                AccountChecker.isCorrectData(login, password, confirmPassword);
                System.out.println("Nice");
            } catch (RuntimeException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }
}
