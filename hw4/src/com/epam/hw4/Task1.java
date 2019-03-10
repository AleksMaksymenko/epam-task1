package com.epam.hw4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter text: ");
        String line = in.next();
        System.out.println("Unique chars: " + findChars(line));

    }
    static String findChars(String line) {
        if (checkLines(line)) {
            String res = "";
            int len = line.length();
            int index = 0;
            while (index < len) {
                char ch = line.charAt(index);
                if (line.indexOf(ch) >= 0 && !res.contains(String.valueOf(ch))) {
                    res = res + ch;
                }
                index++;
            }
            return res;
        }
        return null;
    }
    static boolean checkLines(String line) {
        return line != null && line.trim().length() !=0 && line.length() != 0;
    }
}
