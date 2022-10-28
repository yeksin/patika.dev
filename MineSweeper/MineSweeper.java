package mineSweeper;

import java.util.Arrays;
import java.util.Scanner;

public class MineSweeper {

    String[][] gameZone;
    char[][] matrix;

    public void run() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen satýr giriniz: ");
        int line = scan.nextInt();
        System.out.print("Lütfen sütun giriniz: ");
        int column = scan.nextInt();

        createField(line, column);
        AddMines(line, column);
        ShowField(line, column);


        int loopSize = (line * column) - ((line * column) / 4);
        System.out.println("Mayýn Tarlasý Oyuna Hoþgeldiniz !");
        while (loopSize > 0) {

            for (int i = 0; i < line; i++) {
                for (int j = 0; j < column; j++) {
                    System.out.print(gameZone[i][j] + " ");
                }
                System.out.print("\n");
            }
            int sum = 0;
            System.out.print("Satýr giriniz: ");
            int line1 = (scan.nextInt()) - 1;
            System.out.print("Sütun giriniz: ");
            int column2 = (scan.nextInt()) - 1;
            if (line >= line1 && column >= column2 && line1 >= 0 && column2 >= 0) {
                if (matrix[line1][column2] == '*') {
                    System.out.println("Game Over!");
                    break;
                } else {
                    if (line1 - 1 >= 0 && column2 - 1 >= 0)
                        if (matrix[line1 - 1][column2 - 1] == '*')
                            sum++;

                    if (line1 - 1 >= 0)
                        if (matrix[line1 - 1][column2] == '*')
                            sum++;

                    if (line1 - 1 >= 0 && column2 + 1 < column)
                        if (matrix[line1 - 1][column2 + 1] == '*')
                            sum++;

                    if (column2 - 1 >= 0)
                        if (matrix[line1][column2 - 1] == '*')
                            sum++;

                    if (column2 + 1 < column)
                        if (matrix[line1][column2 + 1] == '*')
                            sum++;

                    if (line1 + 1 < line && column2 - 1 >= 0)
                        if (matrix[line1 + 1][column2 - 1] == '*')
                            sum++;

                    if (line1 + 1 < line)
                        if (matrix[line1 + 1][column2] == '*')
                            sum++;

                    if (line1 + 1 < line && column2 + 1 < column)
                        if (matrix[line1 + 1][column2 + 1] == '*')
                            sum++;


                    gameZone[line1][column2] = String.valueOf(sum);
                }
            } else {
                System.out.println("Yanlýþ deðer girdiniz.");
            }

            System.out.println("=======================");
            loopSize--;

            if (loopSize == 0) {
                System.out.println("Oyunu Kazandýnýz !");

                for (char[] strings : matrix) {
                    for (char string : strings) {
                        System.out.print(string + " ");
                    }
                    System.out.println();
                }
            }
        }
    }

    public void createField(int line, int column) {
        matrix = new char[line][column];
        gameZone = new String[line][column];

        for (String[] strings : gameZone) {
            Arrays.fill(strings, "-");
            Arrays.fill(strings, "-");
            for (char[] strings1 : matrix) {
                Arrays.fill(strings1, '-');
                Arrays.fill(strings1, '-');
            }
        }
    }

    public void AddMines(int line, int column) {
        int minesNum = ((line * column) / 4);

        for (int i = 0; i < minesNum; i++) {
            int randomX = (int) (Math.random() * line);
            int randomY = (int) (Math.random() * column);
            if (matrix[randomX][randomY] == '*') {
                minesNum++;
            } else {
                matrix[randomX][randomY] = '*';
            }
        }
    }

    public void ShowField(int line, int column) {

        System.out.println("Mayýnlarýn Konumu");

        for (char[] strings : matrix) {
            for (char string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
        System.out.println("===========================");
    }
}
