package List.ExerciseFive;

import List.Node;

public class SwapNodesInPairs {
    public Node  swapNodesInPairs(Node head){
        if(head == null || head.next == null) return head;

        Node tmp = head.next.next;
        head.next.next = head;
        head = head.next;
        head.next.next = swapNodesInPairs(tmp);
        return  head;
    }
}
