

    // Complete the reverse function below.

    /*
     * For your reference:
     *
     * DoublyLinkedListNode {
     *     int data;
     *     DoublyLinkedListNode next;
     *     DoublyLinkedListNode prev;
     * }
     *
     */
    static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {
        DoublyLinkedListNode current = head;
        DoublyLinkedListNode previous = head;
        while(current != null) {
            DoublyLinkedListNode temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            previous = current;
            current = current.prev;
        }
        return previous;
    }


