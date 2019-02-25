package com.epam.hw;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Input 3-digit number: "); // код работает верно только для 3-значных вводных переменных
        int Number = in.nextShort();                // при 2- и 4- значных не совершает заданного условия
        int D3 = Number % 10;
        int D1 = (Number - Number % 100) / 100;
        int D2 = (Number - D1 * 100 - D3) / 10;
        int Reverse = D3 * 100 + D2 * 10 +D1;
        System.out.println("Reverse number: " + Reverse);
        System.out.println("Difference between original and reverse: " + (Number - Reverse));
    }
}

