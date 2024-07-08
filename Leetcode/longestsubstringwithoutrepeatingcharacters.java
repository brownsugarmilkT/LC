import java.util.HashSet;

public class longestsubstringwithoutrepeatingcharacters {
    public int lengthOfLongestSubstring(String s) {
     
        if(s.length()<=1){
            return 1;
        }

        int max = 0;
        HashSet<Character> hash = new HashSet<>();

        
        int index = 0;


        for(int i =0;i<s.length();i++){
            while(hash.contains(s.charAt(i))){
                hash.remove(s.charAt(index));
                index++;
            }
            hash.add(s.charAt(i));
            max = Math.max(max, i - index + 1);

            }
                




           
        

        return max;
    }
    
}
