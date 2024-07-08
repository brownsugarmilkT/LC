import java.util.*;

public class groupanagrams {

    
    
}
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         HashMap<String, List<String>> ana = new HashMap<>();


         for(String s: strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            if(ana.containsKey(sorted)){
                ana.put(sorted, new ArrayList<>());
            }

            ana.get(sorted).add(s);
            
         }
         return new ArrayList<>(ana.values());
         
} 
}

