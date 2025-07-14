package Heaps.ExerciseOne;

import java.util.PriorityQueue;

public class KthLargest {
    private int k;
    private PriorityQueue<Integer> heap;

   public  KthLargest (int K, int[] nums){
       this.k = k;
       heap = new PriorityQueue<>();
       for(int num:nums ){
           heap.add(num);
       }
       while(heap.size() > k){
           heap.poll();
       }
   }
   public int add(int val){
       heap.add(val);
       if(heap.size()>k){
           heap.poll();
       }
       return heap.peek();
   }
}
