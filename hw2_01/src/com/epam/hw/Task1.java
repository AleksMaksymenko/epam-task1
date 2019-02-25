package com.epam.hw;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Input x: ");
        int x = in.nextInt();
        System.out.print("Input y: ");
        int y = in.nextInt();
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("New x = " + x + "; New y = " + y);
    }
}
