import java.util.HashMap;
import java.util.*;

public class validanagram {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length())return false;

        HashMap<Character, Integer> hash1 = new HashMap<>();
        HashMap<Character, Integer> hash2 = new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(hash1.containsKey(s.charAt(i))){
                int count = hash1.get(s.charAt(i));
                hash1.remove(s.charAt(i));
                hash1.put(s.charAt(i), count+1);

            }else{
            hash1.put(s.charAt(i), 1);

        }}


        for(int i=0;i<t.length();i++){
            if(!hash1.containsKey(t.charAt(i))){
                return false;

            }
            if(hash2.containsKey(s.charAt(i))){
                int count = hash2.get(t.charAt(i));
                hash2.remove(t.charAt(i));
                hash2.put(t.charAt(i), count+1);
                
            }else{
            hash2.put(t.charAt(i), 1);

        }}
        
    
        for(char a: hash1.keySet()){
            if(!Objects.equals(hash1.get(a), hash2.get(a))){
                return false;

            }

        }
        return true;
}
}