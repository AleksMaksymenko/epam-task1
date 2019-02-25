package com.epam.hw;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Input value: ");
        int Value = in.nextInt();
        System.out.print("Input number of months: ");
        double Months = in.nextDouble();
        System.out.print("Input percent per annum: ");
        double Percent = in.nextDouble();
        double NewPercent = 1 + Percent/100;
        double NumberOfMonthsInYear = 12;
        double PercentPerMonth = Math.pow(NewPercent, 1/NumberOfMonthsInYear); // почему-то здесь оно не принимает число 1/12, пришлось вводить еще переменную
        double NewValue = Value * Math.pow(PercentPerMonth, Months);
        System.out.println("After " + (int)Months + " months with " + Percent + " percent per annum you will get " + (int)NewValue);
    }
}
