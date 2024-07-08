import java.util.*;
public class longestconsecutivesequence {

    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        for(int i:nums){
            hash.add(i);

        }
        int max = 0;


       for(int i =0;i<nums.length;i++){
        if(!hash.contains(nums[i]-1)){
            int cur = nums[i];
            int streak = 1;
            while(hash.contains(cur+1)){
                cur++;
                streak++;

            }
            max = Math.max(streak, max);

        }
       }   
       return max;
           
    }
    
}
