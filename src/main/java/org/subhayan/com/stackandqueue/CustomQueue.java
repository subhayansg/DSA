package org.subhayan.com.stackandqueue;

public class CustomQueue {
    protected int[] queue;
    protected static final int DEFAULT_SIZE = 10;

    int tail = 0;

    public boolean enqueue(int item) throws StackException {  // adding an item at the end of queue is called enqueue
        // takes O(1) time
        if (isFull()) {
            throw new StackException("Queue is full! Cannot enqueue!");
        }
        queue[tail++] = item;
        return true;
    }

    public int dequeue() throws StackException {  // removing an item from the start is called dequeue
        // this takes O(n) time due to shift
        if (isEmpty()) {
            throw new StackException("Queue is empty! Cannot dequeue!");
        }
        int removedItem = queue[0];

        // shift the elements to left, from index 1, it will go 1 less tail as tail also shifts to left
        for (int i = 1; i < tail; i++) {
            queue[i - 1] = queue[i];
        }
        tail--;
        return removedItem;
    }

    public CustomQueue(int size) {
        this.queue = new int[size];
    }

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    private boolean isEmpty() {
        return tail == 0;
    }

    public boolean isFull() {
        return queue.length + 1 == tail;
    }

    public int peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("Can't peek when Stack is empty!");
        }
        return queue[tail];
    }

    public void display() {
        for (int i = 0; i < tail; i++) {
            System.out.print(queue[i] + " ");
        }
    }

    public static void main(String[] args) throws StackException {
        CustomQueue queue1 = new CustomQueue(6);
        queue1.enqueue(34);
        queue1.enqueue(45);
        queue1.enqueue(2);
        queue1.enqueue(9);
        queue1.enqueue(18);
        queue1.enqueue(18);

        queue1.display();
        System.out.println();

        System.out.println(queue1.dequeue());
        queue1.display();

    }
}
