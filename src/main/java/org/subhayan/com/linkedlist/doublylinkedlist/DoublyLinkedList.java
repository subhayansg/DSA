package org.subhayan.com.linkedlist.doublylinkedlist;

public class DoublyLinkedList {

    Node head;

    public void insertFirstElement(int value) {
        Node firstNode = new Node(value);
        firstNode.previousNode = null;  // as this node is now the head, previous node for head node of a DLL is null
        firstNode.nextNode = head;  // old head node becomes the next node

        if (head != null) {
            head.previousNode = firstNode;  // if the LL was empty then head may be null
        }
        head = firstNode;  // new node is now the head
    }

    public void insertLastElement(int value) {
        Node newLastNode = new Node(value);
        newLastNode.nextNode = null;  // next of last node will always be null
        Node temp = head;

        if (head == null) {
            insertFirstElement(value);
            return;
        }

        while (temp.nextNode != null) {
            temp = temp.nextNode;
        }

        temp.nextNode = newLastNode;  // when the prev while loop ends, it is the last node and next is null
                                      // now that next will be the new last node,
                                      // and we have already set next of new last node as null
        newLastNode.previousNode = temp;  // we need to set previous node of the new last node
    }

    public Node findANodeWithGivenValue(int value) {
        Node temp = head;
        while (temp != null) {
            if (temp.value == value) {
                return temp;
            }
            temp = temp.nextNode;
        }
        return null;
    }

    public void insertAfterAGivenNode(int value, int insertAfterNodeValue) {
        Node newNode = new Node(value);
        Node insertAfterThisNode = findANodeWithGivenValue(insertAfterNodeValue);
        if (insertAfterThisNode == null) {
            System.out.println("The given node does not exist!");
            return;
        }
        newNode.nextNode = insertAfterThisNode.nextNode;
        newNode.previousNode = insertAfterThisNode;
        insertAfterThisNode.nextNode = newNode;
        if (newNode.nextNode != null) {
            newNode.nextNode.previousNode = newNode;
        }
    }

    public void display () {
        Node temp = head;
        Node lastNode = null;
        System.out.println("Print in actual order: ");
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            lastNode = temp;  // each time we print a node, that becomes the current last node
            temp = temp.nextNode;
        }
        System.out.print("End");

        // As we have both way pointers we can print in reverse as well
        System.out.println("\nPrint in reverse: ");
        while (lastNode != null) {  // at the end of prev while loop, we have gone till last node for printing
            System.out.print(lastNode.value + " -> ");
            lastNode = lastNode.previousNode;
        }
        System.out.println("Start");
    }

    private class Node {
        int value;
        Node previousNode;
        Node nextNode;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node previousNode, Node nextNode) {
            this.value = value;
            this.previousNode = previousNode;
            this.nextNode = nextNode;
        }
    }
}
