package org.subhayan.com.recursion;

public class SumOfNNumbersUsingRecursion7 {
    public static void main(String[] args) {
        System.out.println(sumOfNNumbers(3));
    }

    static int sumOfNNumbers(int n) {
        if (n <= 1) {
            return n;
        }
        return n + sumOfNNumbers(n - 1);
    }
}
