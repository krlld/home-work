package lesson6.task1;

public class Main {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard(1, 100);
        CreditCard card2 = new CreditCard(2, 200);
        CreditCard card3 = new CreditCard(3, 300);

        card1.showInfo();
        card2.showInfo();
        card3.showInfo();
        System.out.println("----------");

        card1.addMoney(100);
        card2.addMoney(200);
        card3.withdrawMoney(200);

        card1.showInfo();
        card2.showInfo();
        card3.showInfo();
    }
}
