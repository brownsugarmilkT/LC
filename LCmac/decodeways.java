public class decodeways {
    
}
class Solution {

    public int numDecodings(String s) {
        return DP(s, 0, new Integer[s.length()]);
    }

    private int DP(String s, int i, Integer[] dp) {
        if (i == s.length()) {
            return 1;
        }
        if (s.charAt(i) == '0') {
            return 0;
        }
        if (dp[i] != null) {
            return dp[i];
        }
        int count = 0;
        count = DP(s, i + 1, dp) + count;


        if ( i < s.length() - 1 && (s.charAt(i) == '1' || s.charAt(i) == '2' && s.charAt(i + 1) < '7') ) {
            count = DP(s, i + 2, dp) + count;
        }
        dp[i] = count;


        return dp[i];
    }
}



