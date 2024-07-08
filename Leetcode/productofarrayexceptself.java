public class productofarrayexceptself {

    public int[] productExceptSelf(int[] nums) {
        int max = 1;
        int[] array = new int[nums.length];
        boolean zero = false;
        boolean allzero = true; 
        int zerocount = 0;

        


        for(int i =0; i<nums.length;i++){

            if(nums[i]==0){
                zero = true;
                zerocount++;

    
            } 

            if(nums[i]!=0){
            max = max*nums[i];
            allzero = false; 
           }
           
        }

        for(int i = 0; i<nums.length;i++){

            if(allzero || zerocount > 1){
                return array; 
            }
            if(zero){
                if(nums[i]!=0){
                    array[i] = 0;

                }
                if(nums[i]==0){
                    array[i] = max;
                }
            }else{
                array[i] = max/nums[i];

            }

        }
        
        return array;
        
    }
    
}
// for every index other than 0, answer would be 0
// for every index with 0, answer will be the product of everything else
// if there is more than one zero, everything is zero 
