
public class containerwithmostwater {
    public int maxArea(int[] height) {


        int low = 0;
        int high = height.length -1;
        int max = height.length-1;
        for(int i=0; i<height.length;i++){
            
            if(height[low]<height[high]){
                max = Math.max(max, (high-low)*height[low]);
                low++;

            }else{
                max = Math.max(max, (high-low)*height[high]);
                high--;
            }
        }
        return max;




        
    }
    
}
