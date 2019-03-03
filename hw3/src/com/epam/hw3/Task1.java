package com.epam.hw3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose a picture you want to see: from 1 to 5");
        byte triangle = in.nextByte();
        switch (triangle) {
            case 1:
                System.out.println("*");
                System.out.println("* *");
                System.out.println("* * *");
                System.out.println("* * * *");
                System.out.println("* * * * *");
                System.out.println("* * * *");
                System.out.println("* * *");
                System.out.println("* *");
                System.out.println("*");
                break;
            case 2:
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("* * * * *");
                System.out.println("  * * * *");
                System.out.println("    * * *");
                System.out.println("      * *");
                System.out.println("        *");
                break;
            case 3:
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("        *");
                System.out.println("      * *");
                System.out.println("    * * *");
                System.out.println("  * * * *");
                System.out.println("* * * * *");
                break;
            case 4:
                System.out.println("        *");
                System.out.println("      * *");
                System.out.println("    * * *");
                System.out.println("  * * * *");
                System.out.println("* * * * *");
                System.out.println("  * * * *");
                System.out.println("    * * *");
                System.out.println("      * *");
                System.out.println("        *");
                break;
            case 5:
                System.out.println("        *");
                System.out.println("      * * *");
                System.out.println("    * * * * *");
                System.out.println("  * * * * * * *");
                System.out.println("* * * * * * * * *");
                System.out.println("        *");
                System.out.println("      * * *");
                System.out.println("    * * * * *");
                System.out.println("  * * * * * * *");
                System.out.println("* * * * * * * * *");
                break;
            default:
                System.out.println("Incorrect number");
        }
    }
}
