package org.subhayan.com.linkedlist.circularlinkedlist;

public class CircularLinkedList {

    private Node head;
    private Node tail;

    public CircularLinkedList () {
        this.head = null;
        this.tail = null;
    }

    public void insertAtEnd(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.nextNode = newNode;
        newNode.nextNode = head;
        tail = newNode;
    }

    public void deleteAGivenValue(int value) {
        Node temp = head;
        if (temp == null) {
            return;
        }
        if (temp.value == value) {
            head = head.nextNode;
            tail.nextNode = head;
            return;
        }
        do  {
            if (temp.nextNode.value == value) {
                temp.nextNode = temp.nextNode.nextNode;
                break;
            }
            temp = temp.nextNode;
        } while (temp != head);
    }

    public void display() {
        Node temp = head;
        if (head != null) {
            do {
                System.out.print(temp.value + " -> ");
                temp = temp.nextNode;
            } while (temp != head);
            System.out.print("Head");
        }
    }

    private class Node {
        int value;
        Node nextNode;

        public Node(int value) {
            this.value = value;
        }
    }
}
