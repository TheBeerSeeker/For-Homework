import java.util.Random;
import java.util.Scanner;

public class Homework4 {

    static int SIZE = 5;

    static char PLAYER_DOT = 'X';
    static char COMP_DOT = '0';
    static char EMPTY_DOT = '.';

    static char[][] field = new char[SIZE][SIZE];
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    static void initField() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                field[i][j] = EMPTY_DOT;
            }
        }
    }

    static void printField() {
        for (int i = 0; i < SIZE; i++) {
            if (i==0) {
                System.out.print("   " + (i + 1) + " ");
            } else System.out.print((i + 1) + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " |");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(field[i][j] + "|");
            }
            System.out.println();
        }
    }

    static void playerTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты X и Y (1-3)");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x,y));
        field[x][y] = PLAYER_DOT;
    }

    public static void compTurn() {
        int x, y;
        do {
            System.out.println("Ход компа...");
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(x,y));
        field[x][y] = COMP_DOT;
    }

    public static boolean isCellValid(int x, int y) {
        if(x < SIZE || y < SIZE || x >= 0 || y >= 0) return true;
        if(field[x][y] != EMPTY_DOT) return true;
        return false;
    }

    static boolean winCheck(char symb) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (field[0][0] == symb && field[1][1] == symb && field[2][2] == symb && field[3][3] == symb) return true;
                if (field[0][4] == symb && field[1][3] == symb && field[2][2] == symb && field[3][1] == symb) return true;
                if (field[1][1] == symb && field[2][2] == symb && field[3][3] == symb && field[4][4] == symb) return true;
                if (field[1][3] == symb && field[2][2] == symb && field[3][1] == symb && field[4][0] == symb) return true;
                if (field[0][j] == symb && field[1][j] == symb && field[2][j] == symb && field[3][j] == symb) return true;
                if (field[1][j] == symb && field[2][j] == symb && field[3][j] == symb && field[4][j] == symb) return true;
                if (field[i][0] == symb && field[i][1] == symb && field[i][2] == symb && field[i][3] == symb) return true;
                if (field[i][1] == symb && field[i][2] == symb && field[i][3] == symb && field[i][4] == symb) return true;
            }
        }
        return false;
    }

    static boolean isFieldFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if(field[i][j] == EMPTY_DOT) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

    initField();
    printField();
    while (true) {
        playerTurn();
        printField();
        if(winCheck(PLAYER_DOT)) {
            System.out.println("Вы победили!");
            break;
        }
        if (isFieldFull()) {
            System.out.println("Ничья!");
            break;
        }
        compTurn();
        printField();
        if (winCheck(COMP_DOT)) {
            System.out.println("Победила машина!");
            break;
        }
        if(isFieldFull()) {
            System.out.println("Ничья!");
            break;
        }
    }
    }
}
