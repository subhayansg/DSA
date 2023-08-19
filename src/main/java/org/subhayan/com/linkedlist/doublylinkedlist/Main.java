package org.subhayan.com.linkedlist.doublylinkedlist;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertFirstElement(3);
        dll.insertFirstElement(2);
        dll.insertFirstElement(8);
        dll.insertFirstElement(17);

        dll.insertLastElement(88);

        dll.insertAfterAGivenNode(100, 17);

        System.out.println("After insert: ");
        dll.display();
        System.out.println();
    }
}
