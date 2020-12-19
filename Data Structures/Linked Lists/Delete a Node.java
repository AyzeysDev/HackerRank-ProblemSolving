

    // Complete the deleteNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
        if (head == null) {
            return head;
        }  
        if (position == 0) {
            return head.next;
        }
        int counter = 0;
        SinglyLinkedListNode current = head;
        while (counter < position-1) {
            current = current.next;
            counter ++;
        }
        current.next = current.next.next;
        return head;
}


