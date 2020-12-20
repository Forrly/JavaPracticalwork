package com.company;

public class SimpleMultipliers {
    public static void SMrecursion(int num, int mul) {
        if (mul > num / 2) {
            System.out.println(num);
            return;
        }
        if (num % mul == 0) {
            System.out.print(mul+" ");
            SMrecursion(num / mul, mul);
        }
        else {
            SMrecursion(num, ++mul);
        }
    }
}
