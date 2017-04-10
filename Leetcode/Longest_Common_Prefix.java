//4/9/17
import java.util.*;
public class Longest_Common_Prefix {

	public String longestCommonPrefix(String[] strs) {
		if(strs.length == 0){
			return "";
		}
		String result = strs[0];
		for(int i = 1; i < strs.length; i++){
			result = CommonPrefix(strs[i], result);
		}
		return result;
    }

	public String CommonPrefix(String s1, String s2){
		String pre = "";
		for(int i = 1; i <= Math.min(s1.length(),s2.length()); i++){
			if(s1.substring(0,i).equals(s2.substring(0,i))){
				pre = s1.substring(0,i);
			}
		}
		return pre;
	}
}
