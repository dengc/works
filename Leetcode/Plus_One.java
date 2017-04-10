//4/10/17
import java.util.*;
public class Plus_One{

	public int[] plusOne(int[] digits) {
		int l = digits.length;

		while(l > 0 && digits[l - 1] == 9 ){
			digits[l - 1] = 0;
			l--;
		}
		if(l > 0){
			digits[l - 1] += 1;
			return digits;
		}

		int[] newDigits = new int[l+1];
		newDigits[0] = 1;
		return newDigits;
    }
}
