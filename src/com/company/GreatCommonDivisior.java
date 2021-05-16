package com.company;

public class GreatCommonDivisior {


    public static int getGreatestCommonDivisor(int fN, int sN) {
        int value = 0;
        if (fN >= 10 && sN >= 10) {

            for (int i = 1; i <= fN || i <= sN; i++) {
                if (fN % i == 0 && sN % i == 0) {
                    value = i;
                }
            }
            return value;
        }
        return -1;
    }
}
