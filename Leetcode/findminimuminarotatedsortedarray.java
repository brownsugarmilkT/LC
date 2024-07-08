public class findminimuminarotatedsortedarray {
    public int findMin(int[] nums) {
        if(nums[nums.length-1]>nums[0]){
            return nums[0];
        }

        int left = 0;
        int right = nums.length -1;
        

        while(left<right ){
            int index = left +  (right-left)/2;
            
            
            if (nums[index] > nums[index + 1]) {
                return nums[index+ 1];
            }
          
            if (nums[index] < nums[index]) {
                return nums[index];
            }

            // If nums[mid] is greater than the first element, search on the right side
            if (nums[index] >= nums[index-1]) {
                left = index + 1;
            } else { // If nums[mid] is smaller than the first element, search on the left side
                right = index - 1;
            }

        }
        return -1;
        

        
        
    }}
    

