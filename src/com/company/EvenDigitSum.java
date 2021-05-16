package com.company;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        int remainingNumber = number;
        int sum = 0;
        if (number < 0) {
            return -1;
        }
        while (remainingNumber != 0) {
            int digit = remainingNumber % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            remainingNumber = remainingNumber / 10;
        }
        return sum;
    }
}
//public class EvenDigitSum {
//    public static int getEvenDigitSum(int number) {
//        int remender, sum = 0;
//        if (number >= 0) {
//            while (number > 0) {
//                remender = number % 10;
//                if (remender % 2 == 0) {
//                    sum = sum + remender;
//                }
//                number = number / 10;
//            }
//        } else {
//            return -1;
//        }
//        return sum;
//    }
//}