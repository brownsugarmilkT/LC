
import java.util.*;

public class topkfrequenetelements {
    public int[] topKFrequent(int[] nums, int k) {

        Arrays.sort(nums);
        int count = 1;
        int[] arr = new int[k];

        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<nums.length;i++){
        
            if (nums[i] == nums[i - 1]) {
                count++;  
            } else {
                map.put(nums[i - 1], count);  
                count = 1;  
            }
        }

        map.put(nums[nums.length - 1], count);

        PriorityQueue<Integer> heap = new PriorityQueue<>((n1, n2) -> map.get(n1) - map.get(n2));

        for(int i:map.keySet()){
            heap.add(i);
            if(heap.size()>k){
                heap.poll();
            }
        }

        
        for (int i = 0; i < k; i++) {
            arr[i] = heap.poll();
        }

        return arr;

    }
    
}
