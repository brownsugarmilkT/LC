import java.util.*;
public class kclosestpointstoorigin {
    
}class Solution {
    public int[][] kClosest(int[][] points, int k) {

        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[2] - a[2]);

        for(int[] point:points){
            int distSquared = point[0] * point[0] + point[1] * point[1];
            if (maxHeap.size() < k) {
                maxHeap.add(new int[]{point[0], point[1], distSquared});
            } else if (distSquared < maxHeap.peek()[2]) {
                maxHeap.poll();
                maxHeap.add(new int[]{point[0], point[1], distSquared});
            }
        }
    
        int[][] res = new int[k][2];

        int i =0;

        while(k>0){
            int[] p = maxHeap.remove();
            int x = p[0];
            int y = p[1];
            res[i][0] = x;
            res[i][1] = y;
            i++;
            k--;
            
        }

        return res;

        
    }
}




