import java.util.*;

public class twosum {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> hash = new HashMap<>();
        int[] arr = new int[2];

        for (int i =0; i<nums.length;i++){
            hash.put(nums[i], i);

        }
        for (int i =0; i<nums.length;i++){
            int other = target - nums[i];
            if (hash.containsKey(other)){
                if(hash.get(other)!= nums[i]){
                    arr[0] = i;
                    arr[1] = hash.get(other);
                    

                }
            }
        }

        return arr;


    
        
    }
    
}
