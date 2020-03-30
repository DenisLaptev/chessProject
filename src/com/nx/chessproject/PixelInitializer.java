package com.nx.chessproject;



public class PixelInitializer implements PixelProcessor {

    public static final char BLACK_SQUARE_SIMBOL = 'X';
    public static final char WHITE_SQUARE_SIMBOL = ' ';

    @Override
    public void processPixel(char[][] array, int xPos, int yPos, int squareSide, int xPosMax) {

        char pixelChar = getPixelChar(xPos, yPos, squareSide);
        array[yPos][xPos] = pixelChar;
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
}
