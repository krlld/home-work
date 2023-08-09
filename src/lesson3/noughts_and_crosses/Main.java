package lesson3.noughts_and_crosses;

import java.util.Scanner;

public class Main {
    // Testing merge branch
    // Noughts and cross game
    private final static char[][] field = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
    private final static int cols = 3;
    private final static int rows = 3;

    public static void main(String[] args) {
        while (true) {
            for (int i = 1; i < 3; ++i) {
                printField();
                makeTurn(i);
                if (checkingForWin()) {
                    printField();
                    System.out.println("Player " + i + " winning!!!!");
                    return;
                }
            }
        }
    }

    public static void printField() {
        for (int i = 0; i < rows; ++i) {
            System.out.print("-------\n|");
            for (int j = 0; j < cols; ++j) {
                System.out.print(field[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println("-------");
    }

    public static void makeTurn(int playerId) {
        while (true) {
            System.out.print("Player " + playerId + ": ");
            Scanner scanner = new Scanner(System.in);
            int block = scanner.nextInt() - 1;
            if (field[block / cols][block % rows] != ' ') {
                System.out.println("Incorrect field, try again");
                continue;
            }
            char sign = playerId == 1 ? 'X' : 'O';
            field[block / cols][block % rows] = sign;
            break;
        }
    }

    public static boolean checkingForWin() {
        for (int i = 0; i < rows; ++i) {
            char buf = field[i][0];
            boolean flag = true;
            for (int j = 0; j < cols; ++j)
                if (buf != field[i][j]) {
                    flag = false;
                    break;

                }
            if (flag && buf != ' ') {
                return true;
            }
        }

        for (int j = 0; j < cols; ++j) {
            char buf = field[0][j];
            boolean flag = true;
            for (int i = 0; i < rows; ++i)
                if (buf != field[i][j]) {
                    flag = false;
                    break;

                }
            if (flag && buf != ' ') {
                return true;
            }
        }

        char buf = field[0][0];
        boolean flag = true;
        for (int i = 0; i < rows; ++i) {
            if (buf != field[i][i]) {
                flag = false;
                break;
            }
        }
        if (flag && buf != ' ') {
            return true;
        }

        buf = field[0][2];
        flag = true;
        for (int i = rows - 1; i > -1; --i) {
            if (buf != field[rows - i - 1][i]) {
                flag = false;
                break;
            }
        }
        if (flag && buf != ' ') {
            return true;
        }
        return false;
    }
}