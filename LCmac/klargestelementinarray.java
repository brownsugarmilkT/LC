import java.util.*;
public class klargestelementinarray {
    
}
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        for(int i:nums){
            maxHeap.add(i);
        }
        int ans = 0;

        while(k>0){
            ans = maxHeap.remove();
            k--;
        }
        return ans;

    }
}

