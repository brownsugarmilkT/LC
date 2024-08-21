import java.util.*;

public class findtheduplicatenumber {
    
}
class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();

        for(int i:nums){

            if(hash.contains(i)){
                return i;
            }
            hash.add(i);
            
        }
        return -1;
        
    }
}
