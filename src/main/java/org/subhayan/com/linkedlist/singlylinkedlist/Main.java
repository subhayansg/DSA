package org.subhayan.com.linkedlist.singlylinkedlist;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        singlyLinkedList.insertFirstElement(3);
        singlyLinkedList.insertFirstElement(22);
        singlyLinkedList.insertFirstElement(8);
        singlyLinkedList.insertFirstElement(17);
        System.out.println("After insert: ");
        singlyLinkedList.display();
        System.out.println();

//        singlyLinkedList.insertLastElement(88);
//        singlyLinkedList.insertAtAParticularPosition(88, 2);
//        System.out.println("After insert at particular position: ");
//        singlyLinkedList.display();
//        System.out.println();

//        System.out.println("Deleting first element: " + singlyLinkedList.deleteFirstElement());
//        System.out.println("After deleting first element: ");
//        singlyLinkedList.display();
//        System.out.println();

//        System.out.println("Deleting last element: " + singlyLinkedList.deleteLastElement());
//        System.out.println("After deleting last element: ");
//        singlyLinkedList.display();

//        int pos = 2;
//        System.out.println("Deleting element from position: " + pos +
//                " of value: "+ singlyLinkedList.deleteFromParticularIndex(pos));
//        singlyLinkedList.display();
//        System.out.println();

        System.out.println(singlyLinkedList.findNodeOfGivenValue(3));
    }
}
