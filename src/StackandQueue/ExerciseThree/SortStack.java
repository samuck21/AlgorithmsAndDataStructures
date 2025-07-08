package StackandQueue.ExerciseThree;

import java.util.ArrayDeque;
import java.util.Deque;

public class SortStack {
    public Deque<Integer> sort(Deque<Integer>stack){
        Deque<Integer> sortedStack = new ArrayDeque<>();
        while(!stack.isEmpty()){
            Integer element = stack.pop();
            while(!sortedStack.isEmpty() && element>sortedStack.peek()){
                stack.push(sortedStack.pop());
            }
            sortedStack.push(element);
        }
    return sortedStack;
    }


}
