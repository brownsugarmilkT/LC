public class validpalindrome {

    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;
        

        while(start<end){

            while (start < end && !Character.isLetterOrDigit(s.charAt(start))){
                start++;   
                continue;
            }
            while (start < end && !Character.isLetterOrDigit(s.charAt(end))){
                end--;
                continue;

            }

            if(Character.toLowerCase(s.charAt(start))!= Character.toLowerCase(s.charAt(end))){
                return false;
                
            }else{
                start++;
                end--;

            }

            
        }
        return true;
    }
    
}
