package com.epam.areas;

public class Triangle extends Shape {
    private int a;
    private int b;
    private int c;

    public Triangle() {
    }

    public Triangle(String color, int a, int b, int c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calcArea() {
        if (a > 0 && b > 0 && c > 0) {
            if (a + b > c && a + c > b && b + c > a) {
                int p = (a + b + c) / 2;
                return Math.sqrt(p * ((p - a) * (p - b) * (p - c)));
            } else {
                System.out.println("Incorrect sides for triangle.");
                return AREA;
            }
        } else {
            System.out.println("Incorrect sides, they must be more than 0.");
            return AREA;
        }
    }

    @Override
    public String toString() {
        return "Triangle: a = " + a + ", b = " + b + ", c = " + c + ", color = '" + getColor() + '\'' + "; class = '" + getClass() + '\'';
    }
}
