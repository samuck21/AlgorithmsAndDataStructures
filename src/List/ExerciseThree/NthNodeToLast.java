package List.ExerciseThree;

import List.Node;

public class NthNodeToLast {
    public Node nthNodeToLast(Node head,int n){
        Node p1 = head;
        Node p2 = head;

        for(int i =0; i< n ; i++){

            if(p1 == null) return null;
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }

}
