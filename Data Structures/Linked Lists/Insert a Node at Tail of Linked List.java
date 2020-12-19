

    // Complete the insertNodeAtTail function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        
        if (head == null) {
            head = node;
            return node;
        }
        
        SinglyLinkedListNode current = head;
        while (current != null) {
            if (current.next == null) {
                current.next = node;
                return head;
            } else {
                current = current.next;
            }
        }
        return head;
    }


