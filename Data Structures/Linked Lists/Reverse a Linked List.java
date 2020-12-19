

    // Complete the reverse function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        //   SinglyLinkedListNode current = head;
           SinglyLinkedListNode previous = null;
           SinglyLinkedListNode  next = null;
           while (head != null) {
               next = head.next;
               head.next = previous;
               previous = head;
               head = next;
           }
           return previous;
       }
   
   
