package com.epam.hw4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter int number: ");
        int num = in.nextInt();
        System.out.println(num + " = " + convertToBinary(num));
    }
    static String convertToBinary (int denary){
        int temp;
        String binary = "";
        while (denary != 0) {
            temp = denary % 2;
            binary = temp + binary;
            denary = denary / 2;
        }
        return binary;
    }
}
