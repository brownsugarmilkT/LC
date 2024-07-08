public class climbingstairs {



    
}

class Solution {

    
    public int climbStairs(int n) {
       
        return fibo(n+1);

    }

    public int fibo(int n){

    int[] dp = new int[1000];
	dp[0] = 0;
	dp[1] = 1;
	for (int i = 2; i <= n; i++){
		dp[i] = dp[i - 1] + dp[i - 2];
	}
	return dp[n];

        
    }
}
// so I want the base case to be just 1s
// 2 = 1 + 1 or 2
// 3 = 3
//4 = 5
//5 = 8
// Fibonnaci 