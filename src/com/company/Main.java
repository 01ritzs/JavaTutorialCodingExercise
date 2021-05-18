package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        // Video 68 The while and do Challenge Exercise
//        int count = 1;
//        while (count != 6) {
//            System.out.println("Count value is : " + count);
//        }
//        do {
//            System.out.println("Count value is : " + count);
//            count++;
//            if (count > 100) {
//                break;
//            }
//        } while (count != 6)
        System.out.println("Last Digit Checker : " + LastDigitChecker.hasSameLastDigit(234,34,31));
        System.out.println("Last Digit Checker If Number Is Valid: " + LastDigitChecker.isValid(31));

        System.out.println("*********************");

        System.out.println("Sum of Even Digit of the Number : " + EvenDigitSum.getEvenDigitSum(3586));

        System.out.println("*********************");



        System.out.println("*********************");


        System.out.println("Great Common Divisor Of The Two : " + GreatCommonDivisior.getGreatestCommonDivisor(123,321));

        System.out.println("*********************");

        System.out.println("Shared Digit: " + SharedDigit.hasSharedDigit(32, 33));

        System.out.println("*********************");

        System.out.println("Sum of First and Last Digit = " + FirstAndLastDigitSum.sumFirstAndLastDigit(787));

        System.out.println("*********************");

        System.out.println("Palindrome Number is " + NumberPalindrome.isPalindrome(121));

        System.out.println("*********************");

        System.out.println("Sum of digits = " + DigitSumChallenge.sumDigits(45));

        System.out.println("*********************");

        System.out.println("Perfect Number = " + PerfectNumber.isPerfectNumber(6));

        int number = 4;
        int finishNumber = 20;
        int count = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even Number " + number);
            count++;
            if (count >= 5) {
                break;
            }
        }
        System.out.println("Total Number Of Even Number Are: " + count);

    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}
