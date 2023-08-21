package org.subhayan.com.stackandqueue;

import java.util.ArrayDeque;
import java.util.Deque;

// Deque - Doubly ended queue, insertion and deletion is possible from both ends
public class CollectionsDeque {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(89);
        deque.addFirst(44);
        deque.addLast(77);
        System.out.println(deque);

        System.out.println(deque.peek());  // shows the first value of the queue, 44
        deque.remove();  // 44 will be removed
        System.out.println(deque);

        deque.removeFirst();  // 89 will be removed
        System.out.println(deque);
    }
}
