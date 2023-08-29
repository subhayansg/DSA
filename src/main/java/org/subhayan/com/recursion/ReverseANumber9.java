package org.subhayan.com.recursion;

public class ReverseANumber9 {
    public static void main(String[] args) {
//        reverseNumber(123);
//        System.out.println(sum);
//        System.out.println(numberOfdigits(2));
        System.out.println(reverseNumberWithRecursion(1));
        System.out.println(palindromeChecker(12));
    }

    static int sum = 0;
    static void reverseNumber(int n) {
        if (n == 0) {  // single digit numbers
            return;
        }
        int remainder = n % 10;
        sum = (sum * 10) + remainder;
        reverseNumber(n / 10);
    }

    // 1234 -> 4321 -> 4 * 10^3 + rev(123)
    static int reverseNumberWithRecursion(int n) {
        if (n % 10  == n) {  // single digit numbers
            return n;
        }
        // int numberOfDigitsInANumber = (int) (Math.log10(n)) + 1;
        return (((n % 10) * (int) Math.pow(10, numberOfdigits(n / 10))) + reverseNumberWithRecursion(n / 10));
    }

    private static int numberOfdigits(int num) {
        int numOfDigits = 1;
        while (num % 10 != num) {
            numOfDigits++;
            num = num / 10;
        }
        return numOfDigits;
    }

    static boolean palindromeChecker(int n) {
        return n == reverseNumberWithRecursion(n);
    }
}
