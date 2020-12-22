package lesson03;

import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class dz03 {

    public static final char HUMAN_DOT = 'X';
    public static final char PC_DOT = 'O';
    public static final char EMPTY_DOT = '_';
    public static final int MAP_SIZE = 5;
    public static final int WIN_DOT = 4;

    public static final Scanner scanner = new Scanner(System.in);
    public static final Random random = new Random();

    public static char[][] map;

    public static void initMap() {
        map = new char[MAP_SIZE][MAP_SIZE];

        for (int y = 0; y < MAP_SIZE; y++){
            for (int x = 0; x < MAP_SIZE; x++){
                map[y][x] = EMPTY_DOT;
            }
        }
    }

    public static void printMap(){
        for (int y = 0; y < MAP_SIZE; y++){
            for (int x = 0; x < MAP_SIZE; x++){
                System.out.print(map[y][x] + "|");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void humanTurn() {
        int x;
        int y;

        do{
            System.out.println("Введите свои координаты: ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isValidCell(y, x) || !isEmptyCell(y, x));
        map[y][x] = HUMAN_DOT;
    }

    public static void aiTurn() {
        int x;
        int y;

        do {
            x = random.nextInt(MAP_SIZE);
            y = random.nextInt(MAP_SIZE);
        } while (!isEmptyCell(y, x));
        map[y][x] = PC_DOT;
    }

    public static boolean isValidCell(int y, int x) {
        return x >= 0 && x < MAP_SIZE && y >= 0 && y < MAP_SIZE;
    }

    public static boolean isEmptyCell(int y, int x) {
        return map[y][x] == EMPTY_DOT;
    }


    public static boolean checkWin(char inboxChar) {
        int hor, ver;
        int diagLeft, diagRight;
        for (int i = 0; i < MAP_SIZE; i++) {
            hor = 0;
            ver = 0;
            for (int j = 0; j < MAP_SIZE; j++) {
                if (map[i][j] == HUMAN_DOT) {
                    hor++;
                } else if (map[i][j] != HUMAN_DOT && hor < WIN_DOT) {
                    hor = 0;
                }
                if (map[j][i] == HUMAN_DOT) {
                    ver++;
                }   else if (map[j][i] != HUMAN_DOT && ver < WIN_DOT) {
                    ver = 0;
                }
            }
            if (hor >= WIN_DOT || ver >= WIN_DOT)
                return true;
        }

        for (int j = 0; j < MAP_SIZE; j++) {
            diagLeft = 0;
            for (int i = 0; i < MAP_SIZE; i++) {
                int k = j + i;
                if (k < MAP_SIZE) {
                    if (map[i][k] == HUMAN_DOT) {
                        diagLeft++;
                    } else if (map[i][k] != HUMAN_DOT && diagLeft < WIN_DOT) {
                        diagLeft = 0;
                    }
                }
                if (diagLeft >= WIN_DOT)
                    return true;
            }
        }
        for (int j = 1; j < MAP_SIZE; j++) {
            diagLeft = 0;
            for (int i = 0; i < MAP_SIZE; i++) {
                int k = j + i;
                if (k < MAP_SIZE) {
                    if (map[k][i] == HUMAN_DOT) {
                        diagLeft++;
                    } else if (map[k][i] != HUMAN_DOT && diagLeft < WIN_DOT) {
                        diagLeft = 0;
                    }
                }
                if (diagLeft >= WIN_DOT)
                    return true;
            }
        }
        for (int j = 0; j < MAP_SIZE; j++) {
            diagRight = 0;
            for (int i = 0; i < MAP_SIZE; i++) {
                int k = (MAP_SIZE - 1) - i;
                int l = j + i;
                if (k >= 0 && l < MAP_SIZE) {
                    if (map[l][k] == HUMAN_DOT) {
                        diagRight++;
                    } else if (map[l][k] != HUMAN_DOT && diagRight < WIN_DOT) {
                        diagRight = 0;
                    }
                }
                if (diagRight >= WIN_DOT)
                    return true;
            }
        }
        for (int j = 1; j < MAP_SIZE; j++) {
            diagRight = 0;
            for (int i = 0; i < MAP_SIZE; i++) {
                int k = (MAP_SIZE - 1) - j - i;
                if (k >= 0) {
                    if (map[i][k] == HUMAN_DOT) {
                        diagRight++;
                    } else if (map[i][k] != HUMAN_DOT && diagRight < WIN_DOT) {
                        diagRight = 0;
                    }
                }
                if (diagRight >= WIN_DOT)
                    return true;
            }
        }
        return false;
    }

    public static boolean isMapFull() {
        for (int y = 0; y < MAP_SIZE; y++) {
            for (int x = 0; x < MAP_SIZE; x++) {
                if (map[y][x] == EMPTY_DOT) return false;
            }
        }
        return true;
    }

    public static void main (String[] args){
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();

            if (checkWin(HUMAN_DOT)) {
                System.out.println("Human win!!!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!!!");
                break;
            }

            aiTurn();
            printMap();
            if (checkWin(PC_DOT)) {
                System.out.println("AI win!!! ^(((((");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!!!");
                break;
            }
        }
    }
}
