package com.company;
import java.lang.*;
import java.math.*;
public class Main {

    public static void main(String[] args) {
        SimpleDigit digit = new SimpleDigit();
        if (SimpleDigit.SDrecursion(3, 2)) {
            System.out.println("YES");
        } else
            System.out.println("NO");
        SimpleMultipliers number = new SimpleMultipliers();
        number.SMrecursion(80, 2);
        Palindrome pal = new Palindrome();
        if (pal.Precursion("madam"))
            System.out.println("YES");
        else
            System.out.println("NO");
        TwoZeros tz = new TwoZeros();
        System.out.println(tz.TZrecursion(3, 4));
        Reversal num = new Reversal();
        System.out.println(num.RevRecursion(158, 0));

    }

}
