import java.util.*;

public class threesum {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> list = new ArrayList<>();

        HashMap<Integer, Integer> hash = new HashMap<>();
        

        for (int i =0; i<nums.length;i++){
            hash.put(nums[i], i);

        }

        Set<List<Integer>> seen = new HashSet<>();


        for (int i =0; i<nums.length-2;i++){
            if(i>0 && nums[i]!=0&& nums[i]==nums[i-1]){
                continue;
            }
            int anchor = nums[i];
            
            for (int j =i+1; j<nums.length-1;j++){ 
                if(i>0 && nums[i] == nums[i-1])continue;

                if(j>i+1 && nums[j]!=0 && nums[j]==nums[j-1]){
                    continue;
                }
             
                int third = -anchor - nums[j];

                
                
                if (hash.containsKey(third) && hash.get(third) > j  ){
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], third);
                    if (seen.add(triplet)) {  // Only add if not already seen
                        list.add(triplet);
                    }
        
    
}

    
}
        }
        return list;
    }
}
