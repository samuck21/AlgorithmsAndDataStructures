import List.ExerciseFive.SwapNodesInPairs;
import List.ExerciseFour.AddTwoNumbers;
import List.ExerciseOne.RemoveDups;
import List.ExerciseThree.NthNodeToLast;
import List.ExerciseTwo.MergeTwoSortedLists;
import List.Node;
import StackandQueue.ExerciseFour.StackMin;
import StackandQueue.ExerciseThree.SortStack;
import StackandQueue.ExerciseTwo.ValidParenthesis;
import StackandQueue.QueueWithStacks;
import Trees.BinaryTreeTraversals;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;

import static org.junit.Assert.assertEquals;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        //Excercie 1
        // IsUnique is_unique= new IsUnique();
        // System.out.print(is_unique.isUnique("Holaa"));
        /// System.out.print("Hola");
        //Excercice2
        // int[] array = new int[]{ 9,2,5,6};
        //TwoSum twoSum = new TwoSum();
        // int[] result = twoSum.twoSum(array,7);
        //System.out.print(result[1]);
        //Excercice3
        // GroupAnagrams groupAnagrams = new GroupAnagrams();
        //List<List<String>> empty = groupAnagrams.groupAnagram(new String[]{});
        //List<List<String>> anagram = groupAnagrams.groupAnagram(new String[]{"saco","arresto","programa","rastreo","caso"});
        //System.out.print(anagram);
        //Excercuce4
        // ZeroMatriz zeroMatrix = new ZeroMatriz();
        //int[][] matrix ={
        //  {2,1,3,0,2},
        //  {7,4,1,3,8},
        //  {4,0,1,2,1},
        //  {9,3,4,1,9},

        // };
        // System.out.print(zeroMatrix.zeroMatrix(matrix));

        // LinkedList Node
        //Exercise 1
 /*
        RemoveDups removeDups = new RemoveDups();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next  = new Node(3);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(1);
        removeDups.removeDups(head);
        System.out.print(head.value);
        System.out.print(head.next.value);
        System.out.print(head.next.next.value);
        System.out.print(head.next.next.next.value);
        //assertEquals(null,head.next.next.next.value);
*/
        //Exercise 2

        /*
        MergeTwoSortedLists merge = new MergeTwoSortedLists();
        Node list1 = new Node(1);
        list1.next = new Node(2);
        list1.next.next = new Node(4);
        list1.next.next.next = new Node(6);

        Node list2 = new Node(2);
        list2.next = new Node(3);
        list2.next.next = new Node(5);

        Node result = merge.mergeTwoList(list1,list2);

        System.out.print(result.value);
        System.out.print(result.next.value);
        System.out.print(result.next.next.value);
        System.out.print(result.next.next.next.next.value);
        System.out.print(result.next.next.next.next.next.value);
        System.out.print(result.next.next.next.next.next.next.value);

         */
/*

        //Exercise 3

        NthNodeToLast nthNode = new NthNodeToLast();
        Node list = new Node(1);
        list.next = new Node(2);
        list.next.next = new Node(4);
        list.next.next.next = new Node(6);
        System.out.print(nthNode.nthNodeToLast(list,3).value);
        */
         /*
        //Exercise 4
        AddTwoNumbers add= new AddTwoNumbers();
        Node list1 = new Node(1);
        list1.next = new Node(2);
        list1.next.next = new Node(4);
        list1.next.next.next = new Node(6);

        Node list2 = new  Node(5);
        list2.next = new  Node(2);
        list2.next.next = new Node(8);

        Node result = add.addTwoNumbers(list1, list2);
        System.out.print( result.value);
        System.out.print( result.next.value);
        System.out.print( result.next.next.value);
        System.out.print( result.next.next.next.value);
          */

        /*
        //Execise 5

        SwapNodesInPairs swap = new SwapNodesInPairs();
        Node list = new Node(1);
        list.next = new Node(2);
        list.next.next = new Node(4);
        list.next.next.next = new Node(6);
        list.next.next.next.next = new Node(8);
        Node result = swap.swapNodesInPairs(list);
        System.out.print( result.value);
        System.out.print( result.next.value);
        System.out.print( result.next.next.value);
        System.out.print( result.next.next.next.value);
        System.out.print( result.next.next.next.next.value);
           */
        /*
        //Exercise 1
        QueueWithStacks queueWithStacks = new QueueWithStacks();
        queueWithStacks.add(1);
        queueWithStacks.add(2);
        queueWithStacks.add(3);
        System.out.print(queueWithStacks.peek());
        System.out.print(queueWithStacks.size());
        queueWithStacks.remove();
        System.out.print(queueWithStacks.peek());

         */
        /*
        //Exercise 2

        ValidParenthesis valid = new ValidParenthesis();

        System.out.print(valid.isValid("[][][]"));
        System.out.println(valid.isValid("[]{][]"));
        */
        /*
        //Exercise 3
        SortStack sortStack = new SortStack();
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(5);
        stack.push(2);
        stack.push(4);
        Deque<Integer> sortedStack = sortStack.sort(stack);
        System.out.println(sortedStack.peek());
        sortedStack.remove();
        System.out.println(sortedStack.peek());
        sortedStack.remove();
        System.out.println(sortedStack.peek());
        sortedStack.remove();
        System.out.println(sortedStack.peek());

        //
        */
        //Exercise 4

        /*
        StackMin stackMin = new StackMin();
        stackMin.push(3);
        stackMin.push(1);
        stackMin.push(2);
        System.out.println(stackMin.pop());
        */

        //Exercide 1
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.right = new Node(6);

        root.left.left.left = new Node(7);

        root.left.right.left = new Node(8);

        System.out.print("In Order Tasversal:   ");
        BinaryTreeTraversals.inOrderTraversal(root);

        System.out.print("Pre Order Tasversal:   ");
        BinaryTreeTraversals.preOrderTraversal(root);

        System.out.print("Post Order Tasversal:   ");
        BinaryTreeTraversals.postOnderTraversal(root);






    }


}