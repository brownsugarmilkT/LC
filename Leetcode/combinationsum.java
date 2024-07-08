import java.util.*;

public class combinationsum {
    
}class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        Arrays.sort(candidates);

        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, result, new ArrayList<>(), target, 0);
        return result;
    
        
    }

    public void backtrack(int[] candidates, List<List<Integer>> result, List<Integer> cur, int target, int start){
        if(target ==0){
            result.add(new ArrayList<>(cur));
        }
        if(target<0){
            return;
        }

        for(int i=start;i<candidates.length;i++){
            cur.add(candidates[i]);
            backtrack(candidates, result, cur, target-candidates[i], i);
            cur.remove(cur.size()-1);

        }
    }
}
