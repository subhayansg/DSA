package org.subhayan.com.recursion;

public class SumOfDigitsUsingRecursion8 {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(2));
        System.out.println(multiplicationOfDigits(101));
        System.out.println(multiplicationOfDigits(2));
    }

    static int sumOfDigits(int n) {
        if (n <= 1) {
            return n;
        }
        return (n % 10) + sumOfDigits(n/10);
    }

    static int multiplicationOfDigits(int n) {
        if (n % 10 == n) {
            return n;
        }
        return (n % 10) * multiplicationOfDigits(n/10);
    }
}
