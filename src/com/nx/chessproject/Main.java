package com.nx.chessproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static final int SQUARE_SIDE = 3;

    public static final String ENTER_WIDTH_MESSAGE = "Enter Width:";
    public static final String ENTER_HIGHT_MESSAGE = "Enter Height:";

    public static int numberConsoleInput(String message) {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(message);

        int number = 0;
        try {
            number = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return number;
    }

    public static void process2DArray(char[][] chessDesk2DArray,
                                      int xPixelsNumber, int yPixelsNumber, int squareSide,
                                      PixelProcessor pixelProcessor) {

        for (int iy = 0; iy < yPixelsNumber; iy++) {
            for (int ix = 0; ix < xPixelsNumber; ix++) {
                pixelProcessor.processPixel(chessDesk2DArray, ix, iy, squareSide, xPixelsNumber);
            }
        }
    }

    public static void main(String[] args) {

        int width = numberConsoleInput(ENTER_WIDTH_MESSAGE);
        int height = numberConsoleInput(ENTER_HIGHT_MESSAGE);

        int xPixelsNumber = SQUARE_SIDE * width;
        int yPixelsNumber = SQUARE_SIDE * height;

        char[][] chessDesk2DArray = new char[yPixelsNumber][xPixelsNumber];

        process2DArray(chessDesk2DArray, xPixelsNumber, yPixelsNumber, SQUARE_SIDE, new PixelInitializer());

        process2DArray(chessDesk2DArray, xPixelsNumber, yPixelsNumber, SQUARE_SIDE, new PixelPrinter());
    }
}
