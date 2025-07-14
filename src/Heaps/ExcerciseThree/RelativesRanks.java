package Heaps.ExcerciseThree;

import java.util.PriorityQueue;

public class RelativesRanks {
    public String[]  findRelativeRanks(int[] score){
        int numberOfPlayers = score.length;
        String [] res = new String [numberOfPlayers];

        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b)-> score[b]-score[a]);
        for(int i=0; i< numberOfPlayers; i++){
            heap.add(i);
        }
        int position =1;
        while(!heap.isEmpty()){
            int playerIndex = heap.poll();

            switch (position){
                case 1:
                    res[playerIndex]= "Gold Medal";
                    break;
                case 2:
                    res[playerIndex]= "Silver Medal";
                    break;
                case 3:
                    res[playerIndex]= "Bronze Medal";
                    break;
                default:
                    res[playerIndex]=Integer.toString(position);
            }
            position++;
        }
        return res;
    }
}
