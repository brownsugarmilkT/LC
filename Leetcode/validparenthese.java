import java.util.*;

public class validparenthese {

    public boolean isValid(String s) {
        if(s.length()%2!=0)return false;


        char a1 = '(';
        char b1 = '{';
        char c1 = '[';

        char a2 = ')';
        char b2 = '}';
        char c2 = ']';
        if ((s.charAt(0) != a1 && s.charAt(0) != b1 && s.charAt(0) != c1) || 
        (s.charAt(s.length() - 1) != a2 && s.charAt(s.length() - 1) != b2 && s.charAt(s.length() - 1) != c2)) {
        return false;
    }
        Stack<Character> stack = new Stack<>();

        char[] charArray = s.toCharArray();
        for(char a:charArray){
            if(a == a1 || a == b1 || a == c1){
                stack.push(a);
            }else if(stack.isEmpty()){
                return false;
                
            }else if(stack.peek() == a1 && a == a2){
                stack.pop();
                continue;
            }else if (stack.peek() == b1 && a == b2) {
                stack.pop();
                continue;
            }else if (stack.peek() == c1 && a == c2){
                stack.pop();
                continue;
            }else{
                return false;
    }

}           
            return stack.isEmpty();
    
}

}
