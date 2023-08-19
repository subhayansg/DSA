package org.subhayan.com.linkedlist.singlylinkedlist;

public class SinglyLinkedList {

    private Node head;
    private Node tail;

    private int size;  // length of the LL

    public SinglyLinkedList() {
        this.size=0;
    }

    public void insertFirstElement(int value) {
        Node firstNode = new Node(value);
        firstNode.nextNode = head;  // previous head will go to the next node
        head = firstNode;  // The new node will be head now

        if (tail == null) {  // this means this is the first item being added, so tail and head will be same
            tail = head;
        }

        size++;  // increase length or size of the LL
    }

    public void insertLastElement(int value) {
        Node lastNode = new Node(value);

        // If the LL is empty then element would be the first element
        if (tail == null)  {
            insertFirstElement(value);
            return;
        }
        tail.nextNode = lastNode;  // The new node will be the next node of the current tail node
        tail = lastNode;  // And the new tail will be the last node
        size++;
    }

    public void insertAtAParticularPosition(int value, int index) {
        if (index == 0) {
            insertFirstElement(value);
            return;
        } else if (index == size) {
            insertLastElement(value);
            return;
        }

        Node temp = head;
        int startIndex = 1;  // head index = 0, so start from index 1
        while (startIndex < index) {
            temp = temp.nextNode;
            startIndex++;
        }
        Node newNode = new Node(value, temp.nextNode);
        temp.nextNode = newNode;

        size++;
    }

    // Use recursion to insert a value in a SLL at a given index
    public void insertUsingRecursion(int value, int index) {
        head = insertUsingRecursion(value, index, head);
    }

    private Node insertUsingRecursion(int value, int index, Node node) {
        if (index == 0) {
            Node newNode = new Node(value, node);  // node = current node, which becomes the next node for the new node
            size++;
            return newNode;
        }
        node.nextNode = insertUsingRecursion(value, index - 1, node.nextNode);
        return node;
    }

    public int deleteFirstElement() {
        int firstElement = head.value;
        head = head.nextNode;
        if (head == null) {
            tail = null;
        }
        size--;
        return firstElement;
    }

    public Node findNodeAtGivenIndex(int index) {
        Node temp = head;
        int startIndex = 0;
        while (startIndex < index) {
            temp = temp.nextNode;
            startIndex++;
        }
        return temp;
    }

    public Node findNodeOfGivenValue(int value) {
        Node temp = head;
        while (temp.value != value) {
            temp = temp.nextNode;
        }
        return temp;
    }

    public int deleteLastElement() {
        if (size <= 1) {
            return deleteFirstElement();
        }
        Node secondLast = findNodeAtGivenIndex(size - 2);
        int lastElement = tail.value;

        tail = secondLast;
        tail.nextNode = null;

        size--;
        return lastElement;
    }

    public int deleteFromParticularIndex(int index) {
        if (index == 0) {
            deleteFirstElement();
        }
        if (index == size - 1) {
            deleteLastElement();
        }

        Node previousNode = findNodeAtGivenIndex(index - 1);
         // Node toBeDeletedNode = findNodeAtGivenIndex(index);
        Node toBeDeletedNode = previousNode.nextNode;
        int elementAtGivenIndex = toBeDeletedNode.value;

        previousNode.nextNode = previousNode.nextNode.nextNode;

        return elementAtGivenIndex;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.nextNode;
        }
        System.out.print("End");
    }

    private class Node {
        private int value;
        private Node nextNode;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node nextNode) {
            this.value = value;
            this.nextNode = nextNode;
        }
    }
}
