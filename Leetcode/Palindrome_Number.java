//2/9/17
import java.util.*;
public class Valid_Parentheses {

	public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        String word = Integer.toString(Math.abs(x));

        char[] nums = word.toCharArray();
        int l = word.length();
        for(int i=0; i<l/2+1; i++){
        	if(nums[i]!=nums[l-1-i]){
        		return false;
        	}
        }
        return true;

    }
}
