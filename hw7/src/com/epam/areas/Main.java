package com.epam.areas;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shape[] figures = initShapeArray();
        showFigures(figures);
        System.out.println("\n" + getFiguresAreaSum(figures));
        System.out.println("\n" + Arrays.toString(getDifferentFiguresAreasSum(figures)));
    }

    public static Shape[] initShapeArray() {
        return new Shape[]{
                new Rectangle("black", 21, 15),
                new Rectangle("green", 52, 43),
                new Rectangle("orange", 3, 54),
                new Rectangle("blue", -5, 23),
                new Circle("pink", 10),
                new Circle("rod", 217),
                new Circle("violet", -45),
                new Triangle("yellow", 3, 3, 5),
                new Triangle("white", 12, 14, 5)
        };
    }

    public static void showFigures(Shape[] figures) {
        for (Shape row : figures) {
            System.out.println(row.toString());
        }
    }

    public static double getFiguresAreaSum(Shape[] figures) {
        double sumArea = 0.0;
        for (Shape row : figures) {
            sumArea += row.calcArea();
        }
        return sumArea;
    }

    public static double[] getDifferentFiguresAreasSum(Shape[] figures) {
        double circleArea = 0.0;
        double triangleArea = 0.0;
        double rectangleArea = 0.0;
        for (Shape row : figures) {
            if (row instanceof Rectangle) {
                rectangleArea += row.calcArea();
            } else if (row instanceof Triangle) {
                triangleArea += row.calcArea();
            } else {
                circleArea += row.calcArea();
            }
        }
        return new double[]{circleArea, triangleArea, rectangleArea};
    }
}
