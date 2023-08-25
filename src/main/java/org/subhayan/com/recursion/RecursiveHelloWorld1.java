package org.subhayan.com.recursion;

public class RecursiveHelloWorld1 {
    public static void main(String[] args) {
        // Print Hello World 5 times
        message(5);
    }

    static void message(int count) {
        if (count == 0) {  // Base condition
            return;
        }
        System.out.println("Hello World");
        message(count - 1);  // Recursive call
                                   // Although same function is getting called,
                                   // it takes separate space in stack for each call
    }
}
