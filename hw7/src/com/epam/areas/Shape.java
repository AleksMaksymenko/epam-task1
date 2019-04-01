package com.epam.areas;

public class Shape {
    public static final double AREA = 0.0;
    private String color;

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Shape: color = '" + color + '\'' + "; class = '" + getClass() + '\'';
    }

    public double calcArea() {
        return AREA;
    }
}
