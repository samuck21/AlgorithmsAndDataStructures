import List.ExerciseOne.RemoveDups;
import List.Node;
import org.junit.Test;

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




    }
    @Test
    public void removeDupsTest(){
        RemoveDups removeDups = new RemoveDups();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next  = new Node(3);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(1);
        removeDups.removeDups(head);
        assertEquals(1,head.value);
        assertEquals(2,head.next.value);
        assertEquals(3,head.next.next.value);
        assertEquals(4,head.next.next.next.value);
        assertEquals(null,head.next.next.next.value);
    }

}