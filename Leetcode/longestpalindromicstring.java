import java.util.Arrays;

public class longestpalindromicstring {
    
}
class Solution {
    public String longestPalindrome(String s) {
        String n = "";
        int count =0;

        char[] arr = s.toCharArray();
        for(int i=0; i<arr.length;i++){
           String sub1 = expand(i, i, s);
           if(sub1.length()>n.length()){
            n = sub1;
            count++;
           }
           String sub2 = expand(i, i+1,  s);
           if(sub2.length()>n.length()){
            n = sub2;
            count++;
            
           }

        }

        return n;
        
    }
    public String expand(int l, int r, String s){
       

        while(l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        return s.substring(l+1, r);
}
}
