package org.subhayan.com.stackandqueue;

public class CircularQueue {
    protected int[] queue;
    protected static final int DEFAULT_SIZE = 10;

    protected int head = 0;
    protected int tail = 0;
    private int size = 0;

    public CircularQueue(int size) {
        this.queue = new int[size];
    }

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    private boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == queue.length;
    }

    public boolean enqueue(int item) throws StackAndQueueException {
        if (isFull()) {
            throw new StackAndQueueException("Circular queue is full! Cannot enqueue!");
        }
        queue[tail++] = item;
        tail = tail % queue.length;  // ???????????
        size++;
        return true;
    }

    public int dequeue() throws StackAndQueueException {
        if (isEmpty()) {
            throw new StackAndQueueException("Dequeue is not possible in empty queue!");
        }
        int removedItem = queue[head++];
        head = head % queue.length;
        size--;
        return removedItem;
    }

    public int head() throws StackAndQueueException {
        if (isEmpty()) {
            throw new StackAndQueueException("Queue is empty!");
        }
        return queue[head];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
        }
        int i = head;
        do {
            System.out.print(queue[i] + " ");
            i++;
            i %= queue.length;
        } while (i != tail);
        System.out.print("End");
    }

    public static void main(String[] args) throws StackAndQueueException {
        CircularQueue queue = new CircularQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        queue.display();
        System.out.println();

        System.out.println(queue.dequeue());
        queue.display();
        System.out.println();

        queue.enqueue(100);
        queue.display();
        System.out.println();

        System.out.println(queue.head());
    }
}
