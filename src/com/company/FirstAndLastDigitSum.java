package com.company;

public class FirstAndLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        int firstDigit = number % 10;
        int lastDigit = 0;
        if (number < 0) {
            return -1;
        }
        while (number != 0) {
            int valueDigit = number % 10;
            number /= 10;
            if (number <= 9) {
                lastDigit = valueDigit;
            }
        }
        return firstDigit + lastDigit;
    }
}
//public class FirstLastDigitSum {
//
//    public static int sumFirstAndLastDigit(int number) {
//        int remender = number % 10;
//        int lastNumber = 0;
//        if (number >= 0) {
//            while (number > 0) {
//                lastNumber = number % 10;
//                number = number / 10;
//            }
//            return lastNumber + remender;
//        } else {
//            return -1;
//        }
//    }
//}