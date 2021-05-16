package com.company;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int remainingNumber = number;
        while (remainingNumber != 0) {
            int lastDigit = remainingNumber % 10;
            reverse = (reverse * 10) + lastDigit;
            remainingNumber = remainingNumber /10;
        }
        if(number == reverse){
            return true;
        }
        return false;
    }
}
//    public static boolean isPalindrome(int number) {
//        int reverse = 0;
//        int remaining = number;
//        int value;
//        while (number != 0) {
//            value = number % 10;
//            reverse = (reverse * 10) + value;
//            number /= 10;
//        }
//        if (remaining == reverse) {
//            return true;
//        } else {
//            return false;