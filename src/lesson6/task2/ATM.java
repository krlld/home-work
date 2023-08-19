package lesson6.task2;

//  Задача *:
//  Создать класс, описывающий банкомат. Набор купюр, находящихся в банкомате, должен
//  задаваться тремя свойствами: количеством купюр номиналом 20, 50 и 100. Сделать
//  метод для добавления денег в банкомат. Сделать функцию, снимающую деньги, которая
//  принимает сумму денег, а возвращает булевое значение - успешность выполнения
//  операции. При снятии денег, функция должна распечатывать каким количеством купюр
//  какого номинала выдаётся сумма. Создать конструктор с тремя параметрами -
//  количеством купюр каждого номинала.
public class ATM {
    private int count100;
    private int count50;
    private int count20;

    public ATM(int count100, int count50, int count20) {
        this.count100 = count100;
        this.count50 = count50;
        this.count20 = count20;
    }

    public void appendMoney(int count100, int count50, int count20) {
        this.count100 += count100;
        this.count50 += count50;
        this.count20 += count20;
    }

    private class BanknotesSet {
        private int count100 = 0;
        private int count50 = 0;
        private int count20 = 0;

        public int getSum() {
            return count100 * 100 + count50 * 50 + count20 * 20;
        }

        public String toString() {
            return "Sum: " + getSum() + "\n100: " + count100 + ", 50: " + count50 + ", 20: " + count20;
        }
    }

    public boolean isPossibleToWithdraw(int money) {
        BanknotesSet banknotesSet = new BanknotesSet();
        withdraw(money, banknotesSet);
        if (banknotesSet.getSum() == money) {
            System.out.println(banknotesSet.toString());
            return true;
        }
        return false;
    }

    private void withdraw(int money, BanknotesSet banknotesSet) {
        for (int i = 0; i <= count20; i++) {
            if (i * 20 > money) {
                break;
            }
            for (int j = 0; j <= count50; j++) {
                if (i * 20 + j * 50 > money) {
                    break;
                }
                for (int k = 0; k <= count100; k++) {
                    if (i * 20 + j * 50 + k * 100 > money) {
                        break;
                    }
                    if (i * 20 + j * 50 + k * 100 == money) {
                        banknotesSet.count20 = i;
                        banknotesSet.count50 = j;
                        banknotesSet.count100 = k;
                        return;
                    }
                }
            }
        }
    }

    public boolean isPossibleToWithdrawRecursion(int money) {
        BanknotesSet banknotesSet = new BanknotesSet();
        withdrawRecursion(money, banknotesSet);
        if (banknotesSet.getSum() == money) {
            System.out.println(banknotesSet.toString());
            return true;
        }
        return false;
    }

    private void withdrawRecursion(int money, BanknotesSet banknotesSet) {
        if (banknotesSet.count100 < count100 && money >= 100) {
            banknotesSet.count100++;
            withdrawRecursion(money - 100, banknotesSet);
        } else if (banknotesSet.count50 < count50 && money >= 50) {
            banknotesSet.count50++;
            withdrawRecursion(money - 50, banknotesSet);
        } else if (banknotesSet.count20 < count20 && money >= 20) {
            banknotesSet.count20++;
            withdrawRecursion(money - 20, banknotesSet);
        }
    }
}
