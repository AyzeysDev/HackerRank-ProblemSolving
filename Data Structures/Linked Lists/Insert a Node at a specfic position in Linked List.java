

    // Complete the insertNodeAtPosition function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        if(head == null) {
            head = node;
            return node;
        }
        SinglyLinkedListNode current = head;
        for (int index = 1; index < position; ++index) {
            current = current.next;
        }
        node.next = current.next;
        current.next = node;
        
        return head;
    }


