package Arrays.ExerciseTwo;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int [] twoSum(int[]numbers, int targert){
        if(numbers==null || numbers.length<2) return null;
        Map<Integer,Integer> compMap = new HashMap<>();
        for(int i = 0; i<numbers.length ;i++){
            if(compMap.containsKey(numbers[i])) return new int[]{i,compMap.get(numbers[i])};
            int complement = targert- numbers[i];
            compMap.put(complement,i);
        }
        return null;
    }
}
