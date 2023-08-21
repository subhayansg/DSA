package org.subhayan.com.stackandqueue;

import java.util.Arrays;

public class CustomStack {
    protected int[] stack;
    protected static final int DEFAULT_SIZE = 10;

    int top = -1;

    public CustomStack(int size) {
        this.stack = new int[size];  // when we pass a size, it should create an integer array of that size
    }

    public CustomStack() {
        this(DEFAULT_SIZE);  // if no size provided, create an array of DEFAULT_SIZE
    }

    public boolean push(int item) throws StackException {
        if (isFull()) {
            throw new StackException("Stack is full!");
        } else {
            top++;
            stack[top] = item;
            return true;
        }
    }

    public int pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("Stack is empty!");
        }
        int removedItem = stack[top];
        top = top - 1;
        return removedItem;
//        return stack[top - 1];
    }

    private boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return stack.length - 1 == top;
    }

    public int peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("Can't peek when Stack is empty!");
        }
        return stack[top];
    }

    @Override
    public String toString() {
        return "StackCustom{" +
                "stack=" + Arrays.toString(stack) +
                ", top=" + stack[top] +
                '}';
    }

    public static void main(String[] args) throws StackException {
        CustomStack stack = new CustomStack(6);
        stack.push(34);
        stack.push(45);
        stack.push(2);
        stack.push(9);
        stack.push(18);
        stack.push(18);

        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack);

        System.out.println("Peek: " + stack.peek());
    }


}
