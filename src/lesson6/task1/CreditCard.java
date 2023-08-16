package lesson6.task1;

//  Задача 1:
//  Создать класс CreditCard c полями номер счета, текущая сумма на счету. Добавьте
//  метод, который позволяет начислять сумму на кредитную карточку. Добавьте метод,
//  который позволяет снимать с карточки некоторую сумму. Добавьте метод, который
//  выводит текущую информацию о карточке. Напишите программу, которая создает три
//  объекта класса CreditCard у которых заданы номер счета и начальная сумма.
//  Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с
//  третьей. Выведите на экран текущее состояние всех трех карточек.
public class CreditCard {
    private int number;
    private int sum;

    public CreditCard(int number, int sum) {
        this.number = number;
        this.sum = sum;
    }

    public void addMoney(int money) {
        sum += money;
    }

    public void withdrawMoney(int money) {
        sum -= money;
    }

    public void showInfo() {
        System.out.println("Card with number: " + number + " has money: " + sum);
    }
}
