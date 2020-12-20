package com.company;

public class SimpleDigit {
    public static boolean SDrecursion(int dgt, int del) {
        if (dgt < 2) {
            return false;
        }
        else if (dgt == 2) {
            return true;
        }
        else if (dgt % del == 0) {
            return false;
        }
        else if (del < dgt / 2) {
            return SDrecursion(dgt, del + 1);
        } else {
            return true;
        }
    }
}
