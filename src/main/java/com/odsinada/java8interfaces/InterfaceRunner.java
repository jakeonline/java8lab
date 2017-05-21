package com.odsinada.java8interfaces;

import java.util.Arrays;
import java.util.List;

public class InterfaceRunner {

    public static void main(String[] args) {
        Square sq1 = new Square(4);
        Square sq2 = new Square(7);
        EquilateralTriangle et1 = new EquilateralTriangle(2);
        EquilateralTriangle et2 = new EquilateralTriangle(10);

        List<RegularPolygon> shapesList = Arrays.<RegularPolygon>asList(sq1, sq2, et1, et2);
        RegularPolygon[] shapes = shapesList.toArray(new RegularPolygon[shapesList.size()]);

        System.out.println(RegularPolygon.totalSides(shapes));

        System.out.println(sq1.getPerimiter());
        System.out.println(et2.getPerimiter());

        System.out.println(et2.getInteriorAngle());
    }

}
