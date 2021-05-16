package com.company;

public class SharedDigit {
    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        int digit1 = firstNumber;
        int digit2 = secondNumber;
        int remainder = 0;
        int remainder2 = 0;
        if (firstNumber >= 10 && firstNumber <= 99 &&
                secondNumber >= 10 && secondNumber <= 99) {
            while (digit1 != 0) {
                remainder = digit1 % 10;
                digit1 /= 10;

                while (digit2 != 0) {
                    remainder2 = digit2 % 10;
                    if (remainder == remainder2) {
                        return true;
                    }
                    digit2 /= 10;
                }
                digit2 = secondNumber;
            }
        }
        return false;
    }
}
