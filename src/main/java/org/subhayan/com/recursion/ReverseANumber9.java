package org.subhayan.com.recursion;

public class ReverseANumber9 {
    public static void main(String[] args) {
        reverseNumber(123);
        System.out.println(sum);
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

    static int reverseNumberWithRecursion(int n) {
        if (sum == 0) {  // single digit numbers
            return 0;
        }
        int remainder = n % 10;
        sum = (sum * 10) + remainder;
        reverseNumberWithRecursion(n / 10);
        return sum;
    }
}
