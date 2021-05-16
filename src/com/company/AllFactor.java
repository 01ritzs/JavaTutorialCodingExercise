package com.company;

public class AllFactor {
    public static void printFactors(int fN) {
        if (fN >= 1) {
            for (int i = 1; i <= fN; i++) {
                if (fN % i == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Invalid Valuequi");
        }
    }
}
