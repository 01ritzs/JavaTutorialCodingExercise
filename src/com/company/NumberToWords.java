package com.company;

public class NumberToWords {
    public static void numberToWords(int number) {
        //String reverseNumber = reverse(number);
        String stringNumber = String.valueOf(number);
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            // save the length of string
            int size = stringNumber.length();
            // use for loop from 0 to length
            for (int i = 0; i < size; i++) {
                // extract frist character form string using charAt
                char ch = stringNumber.charAt(i);
                // use of switch statement over extracted character
                switch (ch) {
                    case '0':
                        System.out.print(" Zero");
                        break;
                    case '1':
                        System.out.print(" One");
                        break;
                    case '2':
                        System.out.print(" Two");
                        break;
                    case '3':
                        System.out.print(" Three");
                        break;
                    case '4':
                        System.out.print(" Four");
                        break;
                    case '5':
                        System.out.print(" Five");
                        break;
                    case '6':
                        System.out.print(" Six");
                        break;
                    case '7':
                        System.out.print(" Seven");
                        break;
                    case '8':
                        System.out.print(" Eight");
                        break;
                    case '9':
                        System.out.print(" Nine");
                        break;
                }
            }
        }
    }


        public static int reverse(int sum) {
            int value = 0;
            while (sum > 0 || sum < 0) {
                int remender = sum % 10;
                value = value*10 + remender;
                sum = sum / 10;
            }
            return value;
        }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        } else {
            int size = String.valueOf(number).length();
            return size;
        }
    }
}
