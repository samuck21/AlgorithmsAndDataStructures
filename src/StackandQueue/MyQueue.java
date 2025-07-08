package StackandQueue;

import List.Node;

public class MyQueue {
    private Node first;
    private  Node last;
    public void add(int value){
        Node newLast = new Node(value);
        if(last != null){
            last.next = newLast;
        }
        if(first == null){
            first = last;
        }
    }
    public int remove(){
        if(first == null){

        }
        int firstValue = first.value;
        first = first.next;
        if(first == null){
            last = null;
        }
        return  firstValue;
    }
    public  int peek(){
        if(first == null){

        }
        return  first.value;
    }
    public boolean isEmpty(){
        return first == null;
    }
}
