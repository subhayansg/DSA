package org.subhayan.com.recursion;

public class FibonacciNumbersUsingRecursion3 {
    // Find the nth Fibonacci number
    // 0, 1, 1, 2, 3, 5, 8, 13, 21.....
    // Fibo(n) = Fibo(n-1) + Fibo(n-2)

    public static void main(String[] args) {
        System.out.println(findNthFibonacciNumber(6));
    }

    static int findNthFibonacciNumber(int n) {
        // base condition
        if (n < 2) {
            return n;
        } else if (n == 3) {
            return 1;
        }
        return findNthFibonacciNumber(n - 1) + findNthFibonacciNumber(n - 2);
    }
}
