import java.util.*;
public class containsduplicate {

    public boolean containsDuplicate(int[] nums) {
        
        HashMap<Integer, Integer> hash = new HashMap<>();
        

        for (int i =0; i<nums.length;i++){
            hash.put(nums[i], i);

        }

        for (int i =0; i<nums.length;i++){
            if(hash.containsKey(nums[i]) && hash.get(nums[i])!=i){
                return true;
            }
        }
        return false;
         
    }
    
}
