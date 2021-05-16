package com.company;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int fN, int sN, int tN) {
        int d1 = 0;
        int d2 = 0;
        int d3 = 0;
        if (fN >= 10 && fN <= 1000 &&
                sN >= 0 && sN <= 1000 &&
                tN >= 0 && tN <= 1000) {
            d1 = fN % 10;
            d2 = sN % 10;
            d3 = tN % 10;
            if (d1 == d2) {
                return true;
            } else if (d2 == d3) {
                return true;
            } else if (d3 == d1) {
                return true;
            }
        }
        return false;
    }

    public static boolean isValid(int fN) {
        if (fN >= 10 && fN <= 1000) {
            return true;
        }
        return false;
    }
}


