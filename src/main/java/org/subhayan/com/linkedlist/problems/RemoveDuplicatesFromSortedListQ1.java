package org.subhayan.com.linkedlist.problems;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 */
public class RemoveDuplicatesFromSortedListQ1 {

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.insertLastElement(1);
        node.insertLastElement(1);
        node.insertLastElement(2);
        node.insertLastElement(3);
        node.insertLastElement(3);
        node.insertLastElement(3);
        node.display();
        System.out.println();
        node.deleteDuplicates();
        node.display();
    }


    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }


        private ListNode head;
        private ListNode tail;
        private int size;

        public void insertFirstElement(int value) {
            ListNode firstNode = new ListNode(value);
            firstNode.next = head;  // previous head will go to the next node
            head = firstNode;  // The new node will be head now

            if (tail == null) {  // this means this is the first item being added, so tail and head will be same
                tail = head;
            }

            size++;  // increase length or size of the LL
        }

        public void insertLastElement(int value) {
            ListNode lastNode = new ListNode(value);

            // If the LL is empty then element would be the first element
            if (tail == null)  {
                insertFirstElement(value);
                return;
            }
            tail.next = lastNode;  // The new node will be the next node of the current tail node
            tail = lastNode;  // And the new tail will be the last node
            size++;
        }

        public void deleteDuplicates() {
            ListNode temp = head;
            while (temp.next != null) {
                if (temp.val == temp.next.val) {
                    temp.next = temp.next.next;
                    size--;
                } else {
                    temp = temp.next;
                }
            }
            tail = temp;
            tail.next = null;
        }

        public void display() {
            ListNode temp = head;
            while (temp != null) {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }
            System.out.print("End");
        }
    }
}


