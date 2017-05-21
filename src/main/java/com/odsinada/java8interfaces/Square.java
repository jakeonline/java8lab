package com.odsinada.java8interfaces;

public class Square implements RegularPolygon {

    private final int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public int getNumSides() {
        return 4;
    }

    @Override
    public int getSideLength() {
        return this.sideLength;
    }
}
