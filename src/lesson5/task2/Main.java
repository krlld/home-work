package lesson5.task2;

public class Main {
    //    Задача 2:
    //    Создать программу для раскраски шахматной доски с помощью цикла. Создать
    //    двумерный массив String 8х8. С помощью циклов задать элементам массива значения
    //    B(Black) или W(White). При выводе результат работы программы должен быть
    //    следующим:
    //    W B W B W B W B
    //    B W B W B W B W
    //    W B W B W B W B
    //    B W B W B W B W
    //    W B W B W B W B
    //    B W B W B W B W
    //    W B W B W B W B
    //    B W B W B W B W
    public static void main(String[] args) {
        String [][] field = generateField();
        printField(field);
    }

    public static String[][] generateField() {
        String[][] field = new String[8][8];

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    field[i][j] = "W";
                } else {
                    field[i][j] = "B";
                }
            }
        }

        return field;
    }

    public static void printField(String[][] field){
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }
}
