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

    public static char definePixelChar(int xIntDiv, int yIntDiv) {

        if (((xIntDiv % 2 == 0) && (yIntDiv % 2 == 0))
                || ((xIntDiv % 2 != 0) && (yIntDiv % 2 != 0))) {
            return WHITE_SQUARE_SIMBOL;
        } else {
            return BLACK_SQUARE_SIMBOL;
        }

    }

    public static void printChessDesk(int squareSide, int colsNumber, int rowsNumber) {
        int xPixelsNumber = squareSide * colsNumber;
        int yPixelsNumber = squareSide * rowsNumber;

        for (int iy = 0; iy < yPixelsNumber; iy++) {
            int yIntDiv = iy / squareSide;
            for (int ix = 0; ix < xPixelsNumber; ix++) {
                int xIntDiv = ix / squareSide;
                char pixelChar = definePixelChar(xIntDiv, yIntDiv);
                System.out.print(pixelChar);
            }
            System.out.print("\n");
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

        printChessDesk(SQUARE_SIDE, width, height);
    }
}
