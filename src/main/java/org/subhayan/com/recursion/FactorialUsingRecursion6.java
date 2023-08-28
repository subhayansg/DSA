package org.subhayan.com.recursion;

/*
Recurrence relation: n! = n * fact(n - 1)
Base condition: fact(1) = 1, fact(0) = 1
 */
public class FactorialUsingRecursion6 {
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }

    static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
