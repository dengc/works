//3/19/17
import java.util.*;
public class Reverse_Integer {
	public static int reverse(int x) {
		int num =x;
		long result =0;
		while(num !=0){
			int last = num  % 10;
			result = last + result *10;
			num = num/10;
		}
		if(result>Integer.MAX_VALUE || result<Integer.MIN_VALUE ){
			return 0;
		}
		return (int)result;
    }
}
