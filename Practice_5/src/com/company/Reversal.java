package com.company;

public class Reversal {
    public static int RevRecursion(int n, int i) {
        return (n==0) ? i : RevRecursion( n/10, i*10 + n%10 );
    }

}
