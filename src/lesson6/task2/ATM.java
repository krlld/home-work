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

    public boolean isPossibleToWithdraw(int money) {
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
                        System.out.printf("100: %d, 50: %d, 20: %d", k, j, i);
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
