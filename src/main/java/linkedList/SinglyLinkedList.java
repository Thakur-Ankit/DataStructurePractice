package main.java.linkedList;


/**
 * The type Singly linked list.
 */
public class SinglyLinkedList {

    /**
     * The Head.
     */
    ListNode head;

    /**
     * The type List node.
     */
    static class ListNode {
        private int data;
        private ListNode next;

        /**
         * Instantiates a new List node.
         *
         * @param data the data
         */
        public ListNode(int data) {
            this.data = data;
        }

        /**
         * Gets data.
         *
         * @return the data
         */
        public int getData() {
            return data;
        }

        /**
         * Sets data.
         *
         * @param data the data
         * @return the data
         */
        public ListNode setData(int data) {
            this.data = data;
            return this;
        }

        /**
         * Gets next.
         *
         * @return the next
         */
        public ListNode getNext() {
            return next;
        }

        /**
         * Sets next.
         *
         * @param next the next
         * @return the next
         */
        public ListNode setNext(ListNode next) {
            this.next = next;
            return this;
        }
    }

    /**
     * Insert at beginning singly linked list.
     *
     * @param list the list
     * @param data the data
     * @return the singly linked list
     */
    public static SinglyLinkedList insertAtBeginning(SinglyLinkedList list, int data) {
        ListNode node = new ListNode(data);
        if (list.head == null) {
            list.head = node;
        } else {
            ListNode first = list.head;
            list.head = node;
            node.next = first;
        }
        return list;
    }

    /**
     * Insert after position singly linked list.
     *
     * @param list     the list
     * @param data     the data
     * @param position the position
     * @return the singly linked list
     */
    public static SinglyLinkedList insertAfterPosition(SinglyLinkedList list, int data, int position) {
        ListNode node = new ListNode(data);
        if (position == 0) {
            list.head = node;
        } else {
            ListNode positionNode = list.head;
            for (int i = 1; i < position; i++) {
                positionNode = positionNode.next;
            }
            ListNode nextNode = positionNode.next;
            positionNode.next = node;
            node.next = nextNode;
        }
        return list;
    }

    /**
     * Insert at end singly linked list.
     *
     * @param list the list
     * @param data the data
     * @return the singly linked list
     */
    public static SinglyLinkedList insertAtEnd(SinglyLinkedList list, int data) {
        ListNode node = new ListNode(data);
        node.next = null;
        if (list.head == null) {
            list.head = node;
        } else {
            ListNode last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = node;
        }
        return list;
    }

    /**
     * Print list.
     *
     * @param list the list
     */
    public static void printList(SinglyLinkedList list) {
        ListNode currNode = list.head;

        System.out.print("LinkedList : ");

        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }

    /**
     * Length of list int.
     *
     * @param list the list
     * @return the int
     */
    public static int lengthOfList(SinglyLinkedList list) {
        int length = 0;
        ListNode currentNode = list.head;
        while (currentNode != null) {
            length++;
            currentNode = currentNode.next;
        }
        return length;
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList = insertAtEnd(singlyLinkedList, 1);
        singlyLinkedList = insertAtEnd(singlyLinkedList, 2);
        singlyLinkedList = insertAtEnd(singlyLinkedList, 3);
        singlyLinkedList = insertAtEnd(singlyLinkedList, 4);
        singlyLinkedList = insertAtEnd(singlyLinkedList, 5);
        singlyLinkedList = insertAtEnd(singlyLinkedList, 6);
        singlyLinkedList = insertAtEnd(singlyLinkedList, 7);
        singlyLinkedList = insertAtEnd(singlyLinkedList, 8);
        singlyLinkedList = insertAtEnd(singlyLinkedList, 9);
        singlyLinkedList = insertAtEnd(singlyLinkedList, 10);

        singlyLinkedList = insertAtBeginning(singlyLinkedList, 11);

        // linked list start from index 1 for this position value
        singlyLinkedList = insertAfterPosition(singlyLinkedList, 12, 1);

        printList(singlyLinkedList);

        System.out.println("\nLength of the SinglyLinkedList : " + lengthOfList(singlyLinkedList));

    }
}