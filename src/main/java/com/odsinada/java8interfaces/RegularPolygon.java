package com.odsinada.java8interfaces;

public interface RegularPolygon {

    public static int totalSides(RegularPolygon[] shapes) {

        int totalSides = 0;

        for (RegularPolygon curr : shapes) {
            totalSides += curr.getNumSides();
        }

        return totalSides;
    }

    public abstract int getNumSides();

    public abstract int getSideLength();

    public default int getPerimiter() {
        return getSideLength() * getNumSides();
    }

    public default double getInteriorAngle() {
        return (getNumSides() - 2) * Math.PI / getNumSides();
    }
}
