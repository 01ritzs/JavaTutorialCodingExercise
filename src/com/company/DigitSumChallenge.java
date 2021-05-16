package com.company;

public class DigitSumChallenge {
    public static int sum = 0;

    public static int sumDigits(int number) {
        if (number >= 10) {
            while (number != 0) {
                int value = ( number % 10);
                number /= 10;
                sum += value;
            }
            return sum;
        }
        return -1;
    }
}
