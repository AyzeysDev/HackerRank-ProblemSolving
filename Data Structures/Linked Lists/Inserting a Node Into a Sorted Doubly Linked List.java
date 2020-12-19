

    // Complete the sortedInsert function below.

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
    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
        if (head==null) {
            return newNode;
        }
        DoublyLinkedListNode current = head;
        DoublyLinkedListNode previous = null;
        
        if(data < current.data) {
            current.prev = newNode;
            newNode.next = current;
            newNode.prev = null;
            return newNode;
        }
        
        while (current!= null && data > current.data) {
            previous = current;
            current = current.next;
        }
        
        if (current==null) {
            newNode.prev = previous;
            newNode.next = null;
            previous.next = newNode;
            return head;
        } else {
            previous.next = newNode;
            newNode.prev = previous;
            current.prev = newNode;
            newNode.next = current;            
        }
        return head;
        
        
    }


