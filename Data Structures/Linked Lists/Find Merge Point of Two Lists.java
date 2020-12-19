

    // Complete the findMergeNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode currentA = head1;
        SinglyLinkedListNode currentB = head2;

    //Do till the two nodes are the same
        while(currentA != currentB){
        //If you reached the end of one list start at the beginning of the other one
        //currentA
            if(currentA.next == null){
             currentA = head1;
            }else{
                currentA = currentA.next;
            }
        //currentB
            if(currentB.next == null){
                currentB = head2;
            }else{
                currentB = currentB.next;
            }
        }
        return currentA.data;
    }


