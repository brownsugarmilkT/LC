public class searchinarotatedsortedarray {
    public int search(int[] nums, int target) {
        if(nums.length==1){
            if(nums[0]==target){
                return 0;
            }else{
                return -1;

            }

        }
        int left = 0;
        int right = nums.length -1;
        

        while(left<right ){
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                return mid;
            }
            
         
            if (nums[left] <= nums[mid]) { 
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1; 
                } else {
                    left = mid + 1; 
                }
            } else { // Right side must be sorted
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1; 
                }
            }

        }
        return -1;
    }
}
