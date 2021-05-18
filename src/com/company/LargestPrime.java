package com.company;

public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(45));
    }

    public static int getLargestPrime(int number) {
        int value = 0;
        int value2 = 0;
        if (number <= 0) {
            return -1;
        }
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                value = i;
            }
        }
        for (int i = 1; i <= value; i++) {
            if (value % i == 0) {
                value2 = i;
            }
        }
        return value2;
    }
}
//    public static int getLargestPrime(int number){
//
//        if (number < 2) return -1;
//
//        int findPrime = 0;
//
//        for (int i = number; i >= 2; i--) {
//
//            if (number%i==0) {
//
//                findPrime += i;
//
//                for (int j = findPrime-1; j >= 2;j--) {
//                    if (findPrime%j==0) {
//                        findPrime = 0;
//                        findPrime += j;
//                    }
//                }
//                return findPrime;
//            }
//        }
//        return findPrime;
//    }
//
//}