package com.odsinada.java8interfaces;

public class EquilateralTriangle implements RegularPolygon {

    private final int sideLength;

    public EquilateralTriangle(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public int getNumSides() {
        return 3;
    }

    @Override
    public int getSideLength() {
        return this.sideLength;
    }
}
