package com.epam.areas;

public class Circle extends Shape {
    private int radius;
    private double PI = Math.PI;

    public Circle() {
    }

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        if (radius > 0) {
            return PI * radius * radius;
        } else {
            System.out.println("Incorrect radius, it must be more than 0.");
            return AREA;
        }
    }

    @Override
    public String toString() {
        return "Circle: radius = " + radius + ", color = '" + getColor() + '\'' + "; class='" + getClass() + '\'';
    }
}
