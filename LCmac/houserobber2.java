public class houserobber2 {
    
}

class Solution {
    

    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }

        return Math.max(robDP(nums, 0, nums.length - 2), robDP(nums, 1, nums.length - 1) );
    }

    public int robDP(int[] nums, int start, int end) {
        int rob1 = 0;
        int rob2 = 0;
        for (int i = start; i <= end; i++) {
            int tempMax = Math.max(rob1 + nums[i], rob2);
            rob1 = rob2;
            rob2 = tempMax;
        }
        return rob2;
    }
}
