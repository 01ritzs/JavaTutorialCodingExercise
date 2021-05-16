package com.company;

public class PerfectNumber {

    public static boolean isPerfectNumber(int fN){
        if(fN < 1){
            return false;
        }
        int number = fN;
        int sum = 0;
        for (int i = 1; i < fN; i++){
            if(number % i == 0){
                sum += i;
            }
            continue;
        }
        if(sum == fN){
            return true;
        }
        return false;
    }
}
