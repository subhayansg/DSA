package org.subhayan.com.stackandqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CollectionsQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(6);
        queue.add(5);
        queue.add(19);
        queue.add(1);
        System.out.println(queue);

        System.out.println(queue.peek());  // shows the first value of the queue, 3
        queue.remove();  // 3 will be removed
        System.out.println(queue);
    }
}
