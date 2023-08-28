package org.subhayan.com.recursion;

// Write a recursive function to print n to 1
public class printNTo15 {
    public static void main(String[] args) {
        printNTo1UsingRecursion(5);
    }

    static void printNTo1UsingRecursion(int n) {
        if (n == 1) {
            System.out.print(1);
            return;
        }
        System.out.print(n + " ");
        printNTo1UsingRecursion(n - 1);
    }
}
