package com.nx.chessproject;

import static com.nx.chessproject.Main.getPixelChar;

public class PixelInitializer implements PixelProcessor {

    @Override
    public void processPixel(char[][] array, int xPos, int yPos, int squareSide, int xPosMax) {
        char pixelChar = getPixelChar(xPos, yPos, squareSide);
        array[yPos][xPos] = pixelChar;
    }
}
