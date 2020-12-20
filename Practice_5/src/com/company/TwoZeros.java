package com.company;

public class TwoZeros {
    public static int TZrecursion(int a, int b) {
        if (a > b + 1) {
            return 0;
        }
        if (a == 0 || b == 0) {
            return 1;
        }
        return TZrecursion(a, b - 1) + TZrecursion(a - 1, b - 1);
    }
}
