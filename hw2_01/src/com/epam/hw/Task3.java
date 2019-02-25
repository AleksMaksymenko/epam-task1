package com.epam.hw;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Double Pound = 456.3;
        System.out.print("Input weight in pounds: ");
        int WeightPounds = in.nextInt();
        double WeightGrams = WeightPounds * Pound;
        int WeightKg = (int)(WeightGrams - WeightGrams%1000)/1000;
        System.out.println(WeightPounds + " pounds = " + WeightKg + " kilograms " + WeightGrams%1000 + " grams");
    }
}
