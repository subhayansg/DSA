package org.subhayan.com.stackandqueue.problems;

import java.util.Stack;

/**
 * https://leetcode.com/problems/implement-queue-using-stacks/
 * insertion in stack and queue is same (both inserts at the end)
 * deletion is opposite (in queue - from first, in stack - from end)
 * Insert efficient O(1) --> Insert in first stack normally,
 *                          pop() will be O(n) as we need to put items in second and then put it back in first stack
 * Remove efficient O(1) --> Insert in first stack in reverse, so it will be O(n)
 *                          pop() will be O(1)
 */
public class ImplementQueueUsingStacksInsertEfficient {

        private Stack<Integer> stack1;
        private Stack<Integer> stack2;

        public ImplementQueueUsingStacksInsertEfficient() {
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }

        public void push(int x) {
            stack1.push(x);
        }

        public int pop() {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
            int removedItem = stack2.pop();
            while (!stack2.empty()) {
                stack1.push(stack2.pop());
            }
            return removedItem;
        }

        public int peek() {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
            int peekItem = stack2.peek();
            while (!stack2.empty()) {
                stack1.push(stack2.pop());
            }
            return peekItem;
        }

        public boolean empty() {
            return stack1.empty();
        }

    public static void main(String[] args) {

        ImplementQueueUsingStacksInsertEfficient queue1 = new ImplementQueueUsingStacksInsertEfficient();
        queue1.push(10);
        queue1.push(20);
        queue1.push(30);
        queue1.push(40);
        System.out.println("Peek -> " + queue1.peek());
        System.out.println(queue1.pop());
    }
}


