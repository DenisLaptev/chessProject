package com.nx.chessproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static final int SQUARE_SIDE = 3;

    public static final char BLACK_SQUARE_SIMBOL = 'X';
    public static final char WHITE_SQUARE_SIMBOL = ' ';

    public static final String ENTER_WIDTH_MESSAGE = "Enter Width:";
    public static final String ENTER_HIGHT_MESSAGE = "Enter Height:";

    public static int numberConsoleInput(String message) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(message);

        int number = Integer.parseInt(bufferedReader.readLine());

        return number;
    }

    public static char getPixelChar(int xPos, int yPos, int squareSide) {

        char pixelChar = BLACK_SQUARE_SIMBOL;

        int xIntDiv = xPos / squareSide;
        int yIntDiv = yPos / squareSide;

        if (((xIntDiv % 2 == 0) && (yIntDiv % 2 == 0))
                || ((xIntDiv % 2 != 0) && (yIntDiv % 2 != 0))) {
            pixelChar = WHITE_SQUARE_SIMBOL;
        }
        return pixelChar;
    }

    public static char[][] getChessDesk2DArray(int colsNumber, int rowsNumber, int squareSide) {

        int yPixelsNumber = squareSide * rowsNumber;
        int xPixelsNumber = squareSide * colsNumber;

        char[][] chessDesk2DArray = new char[yPixelsNumber][xPixelsNumber];

        for (int iy = 0; iy < yPixelsNumber; iy++) {

            for (int ix = 0; ix < xPixelsNumber; ix++) {

                char pixelChar = getPixelChar(ix, iy, squareSide);
                chessDesk2DArray[iy][ix] = pixelChar;
            }
        }

        return chessDesk2DArray;
    }


    public static void printChessDesk(char[][] chessDesk2DArray) {

        for (char[] row : chessDesk2DArray) {
            for (char element : row) {
                System.out.print(element);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int width = 0;
        int height = 0;

        try {
            width = numberConsoleInput(ENTER_WIDTH_MESSAGE);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            height = numberConsoleInput(ENTER_HIGHT_MESSAGE);
        } catch (IOException e) {
            e.printStackTrace();
        }

        char[][] chessDesk2DArray = getChessDesk2DArray(width, height, SQUARE_SIDE);

        printChessDesk(chessDesk2DArray);
    }
}
