package org.subhayan.com.stackandqueue;

public class DynamicCircularQueue extends CircularQueue{
    public DynamicCircularQueue() {
        super();  // It'll call CircularQueue()
    }

    public DynamicCircularQueue(int size) {
        super(size);  // It'll call CircularQueue(int size)
    }

    @Override
    public boolean enqueue(int item) throws StackAndQueueException {
        if (isFull()) {
            int[] temp = new int[queue.length + 1];
            for (int i = 0; i < queue.length; i++) {
                temp[i] = queue[(head + i) % queue.length];
            }
            head = 0;
            tail = queue.length;
            queue = temp;
        }
        return super.enqueue(item);
    }

    public static void main(String[] args) throws StackAndQueueException {
        CircularQueue queue = new DynamicCircularQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);

        queue.display();
    }
}
