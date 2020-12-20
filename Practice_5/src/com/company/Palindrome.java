package com.company;

public class Palindrome {
    public static boolean Precursion(String str) {
        char firstChar;
        char lastChar;
        int size = str.length();
        String subString;
        if (size <= 1) {
            return true;
        } else {
            firstChar = str.toCharArray()[0];
            lastChar = str.toCharArray()[size - 1];
            subString = str.substring(1, size - 1);
            return firstChar == lastChar && Precursion(subString);
        }
    }
}
