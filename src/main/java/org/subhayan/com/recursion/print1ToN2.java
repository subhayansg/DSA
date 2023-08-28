package org.subhayan.com.recursion;

// write a function that takes a number and prints till that number, print first 5 numbers
public class print1ToN2 {
    public static void main(String[] args) {
        print1ToNUsingRecursion(5);
    }

    static  void print1ToNUsingRecursion(int n) {
        if (n == 0) {
            return;
        }
        print1ToNUsingRecursion(n - 1);
        System.out.print(n + " ");
    }
}
