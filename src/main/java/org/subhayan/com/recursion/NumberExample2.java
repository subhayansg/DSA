package org.subhayan.com.recursion;

public class NumberExample2 {
    public static void main(String[] args) {
        // write a function that takes a number and prints it, print first 5 numbers
        print(1);
    }

    static  void print(int n) {
        if (n == 5) {  // Base condition
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n + 1);
    }
}
