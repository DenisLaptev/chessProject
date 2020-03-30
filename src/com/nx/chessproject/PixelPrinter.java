package com.nx.chessproject;

public class PixelPrinter implements PixelProcessor {

    @Override
    public void processPixel(char[][] array, int xPos, int yPos, int squareSide, int xPosMax) {

        System.out.print(array[yPos][xPos]);
        if (xPos == xPosMax - 1) {
            System.out.println();
        }
    }
}
