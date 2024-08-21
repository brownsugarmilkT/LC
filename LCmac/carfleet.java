import java.util.*;
public class carfleet {
    
}

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] carPS = new int[position.length][2];

        for(int i=0;i<speed.length;i++){
            carPS[i][0] = position[i];
            carPS[i][1] = speed[i];

        }

        Stack<Double> stack = new Stack<>();

        
        Arrays.sort(carPS, java.util.Comparator.comparingInt(o -> o[0]));

        for(int i=position.length-1;i>=0;i--){
            double curTime = speed(target, carPS, i);
            if (!stack.isEmpty() && curTime <= stack.peek()) {
                continue;
            } else {
                stack.push(curTime);
            }
        }
        return stack.size();
    }

    private double speed(int target, int[][] carPS, int i){
        double speed = (double) (target - carPS[i][0]) /carPS[i][1];
        return speed;

    }
}