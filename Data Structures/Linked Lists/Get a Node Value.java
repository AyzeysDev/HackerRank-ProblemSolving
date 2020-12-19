

    // Complete the getNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static int getNode(SinglyLinkedListNode head, int positionFromTail) {
        int forward = 0, counter = 0;
        SinglyLinkedListNode current = head;
        SinglyLinkedListNode node = head;
        while (current.next != null) {
            current = current.next;
            forward++;
            if(forward - counter > positionFromTail) {
                node = node.next;
                counter ++;
            }
        } 
        return node.data;
        

    }


