//4/9/17
import java.util.*;
public class Implement_strStr() {

	public int strStr(String haystack, String needle) {

		int l_needle = needle.length();
		int l_haystack = haystack.length();

		for(int i = 0; i <= l_haystack - l_needle; i++){
			if(haystack.substring(i,i + l_needle).equals(needle)){

				return i;
			}
		}

		return -1;
    }
}
