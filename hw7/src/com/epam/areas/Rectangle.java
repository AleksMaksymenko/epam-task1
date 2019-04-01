package com.epam.areas;

public class Rectangle extends Shape {
    private int a;
    private int b;

    public Rectangle() {
    }

    public Rectangle(String color, int a, int b) {
        super(color);
        this.a = a;
        this.b = b;
    }

    @Override
    public double calcArea() {
        if (a > 0 && b > 0) {
            return a * b;
        } else {
            System.out.println("Incorrect sides, they must be more than 0.");
            return AREA;
        }
    }

    @Override
    public String toString() {
        return "Rectangle: width = " + a + ", height = " + b + ", color = '" + getColor() + '\'' + "; class = '" + getClass() + '\'';
    }
}
