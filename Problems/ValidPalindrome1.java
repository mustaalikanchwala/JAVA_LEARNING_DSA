package Problems;

public class ValidPalindrome1 {
     public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        for(int i = 0;i<s.length()/2;i++){
            char left = s.charAt(i);
            char right = s.charAt(s.length()-i-1);
            if(left!=right) return false;
            }
            return true;

    }
}
