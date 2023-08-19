package org.subhayan.com.linkedlist.circularlinkedlist;

public class Main {

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.insertAtEnd(3);
        cll.insertAtEnd(2);
        cll.insertAtEnd(8);
        cll.insertAtEnd(17);

        System.out.println("After insert: ");
        cll.display();
        System.out.println();

        cll.deleteAGivenValue(8);
        System.out.println("After delete: ");
        cll.display();
        System.out.println();
    }
}
