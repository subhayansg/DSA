package org.subhayan.com.stackandqueue;

import java.util.Stack;

public class CollectionsStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(45);
        stack.push(2);
        stack.push(9);
        stack.push(18);
        System.out.println(stack);

        System.out.println(stack.pop());  // 18 will be removed
        System.out.println(stack);
    }
}
