package com.company;

public class FlourPackProblem {

    public static void main(String[] args) {
        System.out.println((canPack(2, 1, 10)));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount >= 0 && smallCount >= 0 && goal >= 0) {
            bigCount *= 5;
            smallCount *= 1;
            int sum = bigCount + smallCount;
            smallCountCheck(smallCount, goal);
            bigCount(bigCount, goal);
            if (sum >= goal) {
                return true;
            }
        }
        return false;
    }

    private static boolean smallCountCheck(int smallCount, int goal) {
        if (smallCount > goal) {
            return true;
        }
        return false;
    }

    private static boolean bigCount(int bigCount, int goal) {
        if (bigCount > goal)
            return false;
        return false;
    }
}
