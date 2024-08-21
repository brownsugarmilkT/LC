import java.util.*;

public class generateparentheses {
    
}

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();

        dfs("", n, n, res);
        return res;
        


        
    }

    private void dfs(String cur, int left, int right, List<String> res){
        if(left == right && left == 0){
            res.add(cur);
            
        }

        if(left > 0){
            dfs(cur + '(', left - 1, right, res );
        }

        if(right > left){
            dfs(cur + ')', left, right - 1, res );
        }
    }
}

